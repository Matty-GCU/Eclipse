package chapter3;
import  static java.lang.System.*;
import java.util.Scanner;
public class Example3_9_hasNextXXX {
//��reader�������hasNextDouble()�����ȴ��û��ڼ�����������
	public static void main(String[] args) {
		Scanner reader = new Scanner(in);
		double sum = 0;
		int m = 0;
		while(reader.hasNextDouble()) {
			double x = reader.nextDouble();
			m++;				//m = m+1;
			sum +=x;		//sum = sum+x
		}
		out.printf("%d�����ĺ�Ϊ%f\n",m,sum);
		out.printf("%d������ƽ��ֵΪ%f\n",m,sum/m);
		reader.close();
	}
}
