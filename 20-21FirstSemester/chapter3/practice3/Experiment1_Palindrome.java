package practice3;
import static java.lang.System.*;
import java.util.Scanner;

public class Experiment1_Palindrome {

	public static void main(String[] args) {
		Scanner reader = new Scanner(in);
		out.println("please type 1~9999:");
		int x = reader.nextInt();
		reader.close();
		
		if(x<=9)
			out.println(x+" is a perfect number.");
		else if(x<=99 && x>10 && x%11==0)
			out.println(x+" is a perfect number.");
		else if(x<=999 && x>100 && x%100==x/100)
			out.println(x+" is a perfect number.");
		else if(x<=9999 && x>1000 && x/1000==x%10 && x/100%10==x/100%10)
			out.println(x+" is a perfect number.");
		else
			out.println("please type 1~9999");
		
	}

}
//20.10.21