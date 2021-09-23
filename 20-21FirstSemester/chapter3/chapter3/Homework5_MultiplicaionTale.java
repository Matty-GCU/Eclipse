package chapter3;
import static java.lang.System.*;

public class Homework5_MultiplicaionTale {
	//作业5：输出九九乘法表
	public static void main(String[] args) {
		short[] a = {1,2,3,4,5,6,7,8,9};
		for(short b:a) {
			for(short c:a) {
				out.print(b+"*"+c+"= "+b*c+"\t");
			}
			out.println();
		}
	}
}
//20.10.25