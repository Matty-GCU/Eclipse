package chapter2;
import java.util.Scanner;
//��ҵ2�����һԪ���η��̸����б�ʽ
public class Homework1 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("������һԪ���η��̵�ϵ��1��");
		int a = reader.nextInt();
		System.out.println("������һԪ���η��̵�ϵ��2��");
		int b = reader.nextInt();
		System.out.println("������һԪ���η��̵�ϵ��2��");
		int c = reader.nextInt();
		System.out.println("������ķ���Ϊ��"+a+"x*x+"+b+"x+"+c+"=0");
		System.out.println("������̸����ж�ʽ:b*b-4ab="+(b*b+4*a*c));
		reader.close();
	}
}
//20.10.13