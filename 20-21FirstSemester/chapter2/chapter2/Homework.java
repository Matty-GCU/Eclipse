package chapter2;
import java.util.Scanner;
//作业1：输出三位数每一位上的数字
public class Homework {
	public static void main(String args[]) {
		System.out.println("请输入一个三位整数：");
		Scanner a =  new Scanner(System.in);
		int a2 = a.nextInt();
		int b = a2/100;
		int c = a2%10;
		int d = a2/10%10;
		System.out.println("您输入的数字的百位数是："+b);
		System.out.println("您输入的数字的十位数是："+d);
		System.out.println("您输入的数字的个位数是："+c);
		a.close();
	}
}
//20.10.13