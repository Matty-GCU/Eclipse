package questionSolved;
import java.util.Scanner;
import static java.lang.System.out;
//���������������ʣ������ֽ��м��ܡ�����
public class QS1_Secret {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		int i = 1;
		String line = "=================================";
		out.println("���ü���/���ܲ��������ַ�����");
		char secret = reader.next().charAt(0);
		while(i != 0) {
			out.println(line);
			out.println("������Ҫ����/���ܵ����ֻ���ӣ�");
			String input = reader.next();
			char A[] = input.toCharArray();
			out.print("����/ԭ�ģ�");
			for(char b:A) {
				b = (char)(b^secret);
				out.print(b);
			}
			out.println();
			out.println(line);
			out.println("�����������ּ�������/���ܣ�����0��������");
			i = reader.nextInt();
		}
		reader.close();
	}
}
//20.10.19