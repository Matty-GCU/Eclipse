package chapter3;
import java.util.Scanner;
import static java.lang.System.out;

public class Homework2_LeapYear {
	//作业2：判定闰年
	//四年一闰，百年不闰，四百年再闰
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("输入年份：");
		int a = reader.nextInt();
		//方式1
		boolean yes = a%4==0 && a%100!=0;
		boolean yes1 = a%400==0;
		if(yes||yes1) {
			out.println(a+"是闰年");
		}
		else {
			out.println(a+"不是闰年");
		}
		//方式2
		if(a%4==0 && a%100!=0 || a%400==0) {
			out.println(a+"是闰年");
		}
		else {
			out.println(a+"不是闰年");
		}
		reader.close();
	}
}
//20.10.18