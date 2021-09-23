package chapter3;
import java.util.Scanner;

public class Homework3_Equation {
	//作业3：判定一元二次方程是否有解
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("请输入一元二次方程的系数1：");
		int a = reader.nextInt();
		System.out.println("请输入一元二次方程的系数2：");
		int b = reader.nextInt();
		System.out.println("请输入一元二次方程的系数2：");
		int c = reader.nextInt();
		
		System.out.println("你输入的方程"+a+"x+"+b+"x+"+c+"=0");
		int dd = b*b+4*a*c;
		reader.close();
		
		if(dd >=0) {
			System.out.println("该方程有解");
		}
		else {
			System.out.println("该方程无解");
		}
	}
}
//20.10.15