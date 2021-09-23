package part01;
import java.util.Scanner;

public class Example8_9 {

	public static void main(String[] args) {
		String regex = "[a-zA-z|0-9|_]";
		Scanner reader = new Scanner(System.in);
		String s = reader.nextLine();
		if(s.matches(regex)) {
			System.out.println(s+"是由英文字母、数字【或】下划线组成的");
		}
		else {
			System.out.println(s+"中有非法字符");
		}
		reader.close();
	}

}
