package chapter3;
import static java.lang.System.out;
//遍历数组
public class Example3_8 {
	public static void main(String args[]) {
		int a[] = {1,2,3,4};
		char b[] = {'a','b','c','d'};
		
		for(int n=0; n<a.length; n++) {				//传统方式
			out.printf(a[n]+"  ");
		}
		out.println();
		for(int i=0; i<b.length; i++) {
			out.printf(b[i]+"  ");
		}
		
		out.println();
		for(int n1:a) {				//改进方法：循环变量n1依次取数组a每一个元素的值
				out.printf(n1+"  ");
		}
		out.println();
		for(char i1:b) {
			out.printf(i1+"  ");
		}
	}
}
//20.10.18