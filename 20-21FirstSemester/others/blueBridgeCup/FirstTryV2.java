package blueBridgeCup;
import static java.lang.System.*;

public class FirstTryV2 {
	public static void main(String[] args) {
		int x = 20190324;
		long a = 1, b = 1, c = 1, c1;
		long startTime = currentTimeMillis();
		for(int i=4; i<=x; i++) {
			c1 = c;
			c = (a+b+c)%10000;
			a = b;
			b = c1;
		}
		long endTime = currentTimeMillis();
		out.println("循环体运行时间:" + (endTime - startTime) + "ms");
		out.println("第"+x+"项的最后四位数字: "+c);
	}
}//2020.10.30