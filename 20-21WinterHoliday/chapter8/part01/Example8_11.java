package part01;
import java.util.Scanner;

public class Example8_11 {

	public static void main(String[] args) {
		System.out.println("输入一行文本：");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String regex = "[\\s\\d\\p{Punct}]+";
		//空格类字符、数字类字符、标点类字符
		String[]  words = str.split(regex);
		for(int i=0; i<words.length; i++) {
			System.out.println("单词"+i+":"+words[i]);
		}
	}

}
