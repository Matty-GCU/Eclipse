package part99;
import java.util.Scanner;

public class ProgrammingPractice {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		double sum = 0;
		int m = 0;
		String messageException = "�Ƿ��ĳɼ����ݣ�������100��С��0��";
		while(reader.hasNextDouble()) {
			double x = reader.nextDouble();
			assert x<100&&x>0: messageException;
			m++;
			sum +=x;
		}
		System.out.println(m+"�����ĺ�Ϊ"+sum);
		System.out.println(m+"������ƽ��ֵΪ"+sum/m);
		reader.close();
	}
}
