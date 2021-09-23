package cn.edu.gcu.tools;
import java.util.Scanner;

public class GoodsInput {
	public static String iName() {
		Scanner reader = new Scanner(System.in);
		String t = reader.next();
		return t;
	}
	public static int iNumber() {
		Scanner reader = new Scanner(System.in);
		int t = reader.nextInt();
		return t;
	}
	public static double iPrice() {
		Scanner reader = new Scanner(System.in);
		double t = reader.nextDouble();
		reader.close();
		return t;
	}
}
