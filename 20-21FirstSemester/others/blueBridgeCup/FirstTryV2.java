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
		out.println("ѭ��������ʱ��:" + (endTime - startTime) + "ms");
		out.println("��"+x+"��������λ����: "+c);
	}
}//2020.10.30