package chapter3;
import java.util.Scanner;

public class Homework1_NarcissisticNumber {
	//��ҵ1���ж�ˮ�ɻ���
	//һ����λ��������ÿλ���ֵ����η�֮�͵���������
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("������һ����λ����");
		int a = reader.nextInt();
		int a1 = a/100,a2 = a/10%10,a3 = a%10;
		int b = a1*a1*a1+a2*a2*a2+a3*a3*a3;
		if(b == a) {
			System.out.println(a+"��һ��ˮ�ɻ���");
		}
		else {
			System.out.println(a+"����ˮ�ɻ���");
		}
		reader.close();
	}
}
//20.10.15