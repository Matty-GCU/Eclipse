package chapter8;

import java.util.Scanner;

public class H2_PriceComputer {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String str = reader.nextLine();
		String[] numbers = str.split("[^0123456789.]+");
		for(String s: numbers) {
			System.out.println(s);
		}
		reader.close();
	}
}