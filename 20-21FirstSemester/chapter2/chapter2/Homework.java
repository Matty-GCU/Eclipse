package chapter2;
import java.util.Scanner;
//��ҵ1�������λ��ÿһλ�ϵ�����
public class Homework {
	public static void main(String args[]) {
		System.out.println("������һ����λ������");
		Scanner a =  new Scanner(System.in);
		int a2 = a.nextInt();
		int b = a2/100;
		int c = a2%10;
		int d = a2/10%10;
		System.out.println("����������ֵİ�λ���ǣ�"+b);
		System.out.println("����������ֵ�ʮλ���ǣ�"+d);
		System.out.println("����������ֵĸ�λ���ǣ�"+c);
		a.close();
	}
}
//20.10.13