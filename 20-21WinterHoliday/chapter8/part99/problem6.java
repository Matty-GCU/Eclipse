package part99;

import java.util.InputMismatchException;
import java.util.Scanner;

public class problem6 {
	public static void main(String[] args) {
		String s = "数学87分，物理76分，英语96分";
		Scanner scanner = new Scanner(s);
		scanner.useDelimiter("\\D+");
		int sum = 0;
		int count = 0;
		while(scanner.hasNext()) {
			try {
				sum += scanner.nextInt();
				count++;
			}
			catch(InputMismatchException e) {
				System.out.println(e);
			}
		}
		System.out.println("总分数："+sum);
		System.out.println("平均分："+sum/count);
	}
}
