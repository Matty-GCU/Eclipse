package part01;
import java.util.Scanner;

public class Example8_11 {

	public static void main(String[] args) {
		System.out.println("����һ���ı���");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String regex = "[\\s\\d\\p{Punct}]+";
		//�ո����ַ����������ַ���������ַ�
		String[]  words = str.split(regex);
		for(int i=0; i<words.length; i++) {
			System.out.println("����"+i+":"+words[i]);
		}
	}

}
