package chapter3;
import java.util.Scanner;

public class Homework3_Equation {
	//��ҵ3���ж�һԪ���η����Ƿ��н�
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("������һԪ���η��̵�ϵ��1��");
		int a = reader.nextInt();
		System.out.println("������һԪ���η��̵�ϵ��2��");
		int b = reader.nextInt();
		System.out.println("������һԪ���η��̵�ϵ��2��");
		int c = reader.nextInt();
		
		System.out.println("������ķ���"+a+"x+"+b+"x+"+c+"=0");
		int dd = b*b+4*a*c;
		reader.close();
		
		if(dd >=0) {
			System.out.println("�÷����н�");
		}
		else {
			System.out.println("�÷����޽�");
		}
	}
}
//20.10.15