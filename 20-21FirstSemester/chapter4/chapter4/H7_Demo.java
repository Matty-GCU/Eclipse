package chapter4;
import java.util.Scanner;

public class H7_Demo {
	public static void main(String[] args) {
		H7_Student Wang = new H7_Student("001", "王建", "计算机科学与技术"); 
		Scanner reader = new Scanner(System.in);
		String name = reader.next();
		String majoy = reader.next();
		if(Wang.search(name, majoy) == true) {
			System.out.println("搜索到了");
		}
		else {
			System.out.println("查无此人");
		}
		reader.close();
	}
}
//20201209