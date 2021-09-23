package chapter3;
import java.util.Scanner;
//3.4 switch开关语句
public class Example3_4 {
	public static void main(String arg[]) {
		System.out.println("请输入正整数并回车确认");
		Scanner reader = new Scanner(System.in);
		int a = reader.nextInt();
		switch(a) {
		case 9 :
		case 16 : System.out.println(a+"是二等奖");
						break;
		case 209 :
		case 664 :
		case 27 : System.out.println(a+"是一等奖");
						break;
		default : System.out.println(a+"未中奖");
		}
		reader.close();
	}
}
//20.10.17
