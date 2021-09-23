package part99;

import java.util.InputMismatchException;
import java.util.Scanner;

public class problem6 {
	public static void main(String[] args) {
		String s = "��ѧ87�֣�����76�֣�Ӣ��96��";
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
		System.out.println("�ܷ�����"+sum);
		System.out.println("ƽ���֣�"+sum/count);
	}
}
