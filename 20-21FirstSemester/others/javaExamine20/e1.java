package javaExamine20;
import static java.lang.System.out;

public class e1 {
	public static void main(String[] args) {
		for(int a=1; a<=9; a++) {
					for(int b=a; b<=9; b++) {
						out.printf(a + "⨯" + b + "=" + a*b + "\t");
					}
					out.println();
				}
		out.println((int)6.5/3*2.0);
		int a = 5;
		out.println((a++)*5-1<0==true||true);
	}
}
//2020.11.01
//19:32-(14min)-19:46