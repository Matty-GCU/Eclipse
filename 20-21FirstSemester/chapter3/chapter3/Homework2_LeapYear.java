package chapter3;
import java.util.Scanner;
import static java.lang.System.out;

public class Homework2_LeapYear {
	//��ҵ2���ж�����
	//����һ�򣬰��겻���İ�������
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("������ݣ�");
		int a = reader.nextInt();
		//��ʽ1
		boolean yes = a%4==0 && a%100!=0;
		boolean yes1 = a%400==0;
		if(yes||yes1) {
			out.println(a+"������");
		}
		else {
			out.println(a+"��������");
		}
		//��ʽ2
		if(a%4==0 && a%100!=0 || a%400==0) {
			out.println(a+"������");
		}
		else {
			out.println(a+"��������");
		}
		reader.close();
	}
}
//20.10.18