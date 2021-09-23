package part99;
import java.util.Scanner;

public class ProgrammingPractice {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double sum = 0;
		int m = 0;
		String messageException = "非法的成绩数据！（大于100或小于0）";
		while(reader.hasNextDouble()) {
			double x = reader.nextDouble();
			assert x<100&&x>0: messageException;
			m++;
			sum +=x;
		}
		System.out.println(m+"个数的和为"+sum);
		System.out.println(m+"个数的平均值为"+sum/m);
		reader.close();
	}
}
