package javaExamine20;
import static java.lang.System.*;
import java.util.Scanner;
public class e3 {

	public static void main(String[] args) {
		//初始化
		Scanner reader = new Scanner(in);
		out.println("How many Stuents?");
		int x = reader.nextInt();
		int[] students = new int[x];
		int[] numbers = new int[x];
		//录入成绩
		out.println("Please type their grades one by one.");
		for(int i=1; i<=x; i++) {
			out.println("Grade of student " + i + ": ");
			int grade = reader.nextInt();
			numbers[i-1] = i;
			students[i-1] = grade; 
		}
		out.println("Grades restorage completed.");
		//排序
		for(int n=0; n<students.length-1; n++) {
			for(int m=n+1; m<students.length-1; m++) {
				if(students[n]<students[m]) {
					int t = students[n];
					students[n] = students[m];
					students[m] = t;
					int t1 = numbers[n];
					numbers[n] = numbers[m];
					numbers[m] = t1;
				}
			}
		}
		//输出最高分
		out.println("The highest grade: " + students[0]);
		out.print("Of student" + numbers[0] + ".");
		//输出并列最高分
		for(int n=0; n<students.length-1; n++){
			if(students[n]==students[n+1]) {
				out.print(" " + numbers[n+1] + ".");
			}
			else {
				break;
			}
		}
		
		reader.close();
	}

}
//2020.11.01.19:51-(1h)-20:53
//2020.11.02.09:53-(20m)-10:13