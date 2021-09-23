package chapter3;
//计算1+1/2!+1/3!+1/4!+...的前20项和
public class Example3_6 {
	public static void main(String args[]) {
		double sum = 0, count = 1, b = 1;
		while(count <= 20) {
			b = b*(1/count);
			sum = sum + b;
			System.out.println(count+++":        "+sum);
		}
		System.out.printf("\n"+count);
		System.out.printf("\n"+sum);
	}
}
//20.10.18