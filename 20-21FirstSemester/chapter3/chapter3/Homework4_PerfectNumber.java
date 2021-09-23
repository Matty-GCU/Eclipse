package chapter3;
import static java.lang.System.*;
import java.util.Scanner;

public class Homework4_PerfectNumber {
	//作业4：验证完数
	public static void main(String[] args) {
		Scanner reader = new Scanner(in);
		out.println("input:");
		int x = reader.nextInt();
		int i, sum=0;
		for(i=1; i<x; i++) {
			if(x%i==0)
				sum = sum+i;
		}
		if(sum==x)
			out.println(x+" is a perfect number.");
		reader.close();
	}
}
//20.10.20