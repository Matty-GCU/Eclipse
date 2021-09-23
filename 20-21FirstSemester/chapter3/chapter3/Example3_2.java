package chapter3;
//3.3 ifÃıº˛∑÷÷ß”Ôæ‰
public class Example3_2 {
	public static void main(String args[]) {
		int a = 9,b = 5,c = 7,t = 0;
		if(a>b) {		//a°¢b≈≈–Ú
			t = a;
			a = b;
			b = t; 
		}
		if(a>c) {		//a°¢c≈≈–Ú
			t = b;
			b = a;
			a =t;
		}
		if(b>c) {		//b°¢c≈≈–Ú
			t = c;
			c = b;
			b = t;
		}
		System.out.println("a="+a+", b="+b+", c="+c);
	}
}
//20.10.17