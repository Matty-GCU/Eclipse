package chapter3;
import  static java.lang.System.*;
import java.util.Scanner;
public class Example3_9_hasNextXXX {
//让reader对象调用hasNextDouble()方法等待用户在键盘输入数据
	public static void main(String[] args) {
		Scanner reader = new Scanner(in);
		double sum = 0;
		int m = 0;
		while(reader.hasNextDouble()) {
			double x = reader.nextDouble();
			m++;				//m = m+1;
			sum +=x;		//sum = sum+x
		}
		out.printf("%d个数的和为%f\n",m,sum);
		out.printf("%d个数的平均值为%f\n",m,sum/m);
		reader.close();
	}
}
