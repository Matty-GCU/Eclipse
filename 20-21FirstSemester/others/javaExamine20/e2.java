package javaExamine20;
public class e2 {

	public static void main(String[] args) {
		int i, a, b, c;
		for(i=100; i<=999; i++) {
			a = i/100;
			b = i%100/10;
			c = i%10;
			if(i == a*a*a + b*b*b + c*c*c) {
				//int ii = (int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
				System.out.println(i + " is.");
			}
		}
	}

}
//2020.11.01
//19:46-(5min)-19:51