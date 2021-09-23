package chapter3;
//计算8+88+888+...的前12项和
//for循环语句和自增运算符的性质
public class Example3_5 {
	public static void main(String args[]) {
		long sum = 0, a = 8, item = a, n = 12, i;
		for(i=1; i<=n;i++) {
	//表达式1、2可写成i=0; i<n;，输出结果相同
	//表达式3可写成++i，输出结果相同
			sum = sum + item;
			item = item*10+a;
		}
	}
}
//20.10.17