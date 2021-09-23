package part02;

public class OutputEnglish extends OutputAlphabet {
	public void show() {
		for(char c = 'a'; c <= 'z'; c++) {
			System.out.printf("%3c", c);
		}
	}
}
