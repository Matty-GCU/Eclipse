package part01;
import java.util.Scanner;

public class Example8_9 {

	public static void main(String[] args) {
		String regex = "[a-zA-z|0-9|_]";
		Scanner reader = new Scanner(System.in);
		String s = reader.nextLine();
		if(s.matches(regex)) {
			System.out.println(s+"����Ӣ����ĸ�����֡����»�����ɵ�");
		}
		else {
			System.out.println(s+"���зǷ��ַ�");
		}
		reader.close();
	}

}
