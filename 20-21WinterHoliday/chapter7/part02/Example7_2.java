package part02;

interface Test {
	
}
public class Example7_2 {

	public static void main(String[] args) {
		ShowBoard board = new ShowBoard();
		board.showMess(new OutputEnglish());
		//8�д���
		board.showMess(new OutputAlphabet() {
				public void show() {
					System.out.println();
					for(char c = '��'; c <= '��'; c++) {
						System.out.printf("%3c", c);
					}
				}
			}
		);
		
		//�ȼ۵�10�д���
		class NewOutput extends OutputAlphabet {
			public void show() {
				System.out.println();
				for(char c = '��'; c <= '��'; c++) {
					System.out.printf("%3c", c);
				}
			}
		}
		NewOutput newOutput = new NewOutput();
		board.showMess(newOutput);
	}

}
