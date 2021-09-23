package chapter2;
import java.util.Scanner;
//作业2：输出一元二次方程根的判别式
public class Homework1 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入一元二次方程的系数1：");
		int a = reader.nextInt();
		System.out.println("请输入一元二次方程的系数2：");
		int b = reader.nextInt();
		System.out.println("请输入一元二次方程的系数2：");
		int c = reader.nextInt();
		System.out.println("你输入的方程为："+a+"x*x+"+b+"x+"+c+"=0");
		System.out.println("输出方程根的判定式:b*b-4ab="+(b*b+4*a*c));
		reader.close();
	}
}
//20.10.13