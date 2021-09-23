package part02;

interface Test {
	
}
public class Example7_2 {

	public static void main(String[] args) {
		ShowBoard board = new ShowBoard();
		board.showMess(new OutputEnglish());
		//8行代码
		board.showMess(new OutputAlphabet() {
				public void show() {
					System.out.println();
					for(char c = 'α'; c <= 'ω'; c++) {
						System.out.printf("%3c", c);
					}
				}
			}
		);
		
		//等价的10行代码
		class NewOutput extends OutputAlphabet {
			public void show() {
				System.out.println();
				for(char c = 'α'; c <= 'ω'; c++) {
					System.out.printf("%3c", c);
				}
			}
		}
		NewOutput newOutput = new NewOutput();
		board.showMess(newOutput);
	}

}
