package chapter3;
import java.util.Scanner;
//3.4 switch�������
public class Example3_4 {
	public static void main(String arg[]) {
		System.out.println("���������������س�ȷ��");
		Scanner reader = new Scanner(System.in);
		int a = reader.nextInt();
		switch(a) {
		case 9 :
		case 16 : System.out.println(a+"�Ƕ��Ƚ�");
						break;
		case 209 :
		case 664 :
		case 27 : System.out.println(a+"��һ�Ƚ�");
						break;
		default : System.out.println(a+"δ�н�");
		}
		reader.close();
	}
}
//20.10.17
