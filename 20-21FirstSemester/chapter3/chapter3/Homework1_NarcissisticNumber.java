package chapter3;
import java.util.Scanner;

public class Homework1_NarcissisticNumber {
	//作业1：判定水仙花数
	//一个三位数，满足每位数字的三次方之和等于它本身
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入一个三位数：");
		int a = reader.nextInt();
		int a1 = a/100,a2 = a/10%10,a3 = a%10;
		int b = a1*a1*a1+a2*a2*a2+a3*a3*a3;
		if(b == a) {
			System.out.println(a+"是一个水仙花数");
		}
		else {
			System.out.println(a+"不是水仙花数");
		}
		reader.close();
	}
}
//20.10.15