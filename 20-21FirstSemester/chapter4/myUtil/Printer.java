package myUtil;
import java.util.Arrays;

public class Printer {
	public static void p(byte a) {
		System.out.println(a);
	}
	public static void p(short a) {
		System.out.println(a);
	}
	public static void p(char a) {
		System.out.println(a);
	}
	public static void p(int a) {
		System.out.println(a);
	}
	public static void p(long a) {
		System.out.println(a);
	}
	public static void p(float a) {
		System.out.println(a);
	}
	public static void p(double a) {
		System.out.println(a);
	}
	public static void p(boolean a) {
		System.out.println(a);
	}
	//v1.0
	public static void p(String a) {
		System.out.println(a);
	}
	//v1.1
	public static void p(byte[] a) {
		System.out.println(Arrays.toString(a));
	}
	public static void p(short[] a) {
		System.out.println(Arrays.toString(a));
	}
	public static void p(char[] a) {
		System.out.println(Arrays.toString(a));
	}
	public static void p(int[] a) {
		System.out.println(Arrays.toString(a));
	}
	public static void p(float[] a) {
		System.out.println(Arrays.toString(a));
	}
	public static void p(double[] a) {
		System.out.println(Arrays.toString(a));
	}
	public static void p(boolean[] a) {
		System.out.println(Arrays.toString(a));
	}
	public static void p(String[] a) {
		System.out.println(Arrays.toString(a));
	}
	//v2.0
	public static void p(Object a) {
		System.out.println(a);
	}
	//v3.0
	public static void p() {
		System.out.println();
	}
	//v3.1		20201208更新：加入无参方法，可打印换行
	//v4.0		20201208更新：实例方法改为类方法，可直接打印，无需创建并通过对象调用
}	