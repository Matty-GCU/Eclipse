package chapter4;
import java.util.Scanner;

import myUtil.Printer;

public class H4_ParaTest {
	void transform(int x, int y) {
		int t = x;
		x = y;
		y = t;
	}
	void reverse(int[] a) {
		for(int i = 0; i < a.length/2; i++) {
			int t = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = t;
		}
	}
	void print(int[] a) {
		Printer p = new Printer();
		p.p(a);
	}
	public static void main(String[] args) {
		H4_ParaTest paraTest = new H4_ParaTest();
		Scanner reader = new Scanner(System.in);
		Printer p = new Printer();
		
		int m = reader.nextInt();
		int n = reader.nextInt();
		paraTest.transform(m, n);
		p.p(m);
		p.p(n);
		
		int[] a = {1,6,46,4,84,6,4,8,6,6,16};
		paraTest.reverse(a);
		p.p(a);
		
		reader.close();
	}

}
//20201202