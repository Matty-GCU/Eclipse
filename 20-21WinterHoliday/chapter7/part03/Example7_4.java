package part03;

public class Example7_4 {

	public static void main(String[] args) {
		int n = 0, m = 0, t = 1000;
		try {
			m = Integer.parseInt("8888");
			n = Integer.parseInt("ab88");		//发生异常，转向catch
			t = 7777;											//t没有机会被赋值
		}
		catch(NumberFormatException e) {
			System.out.println("发生异常");
			System.out.println(e.getMessage());
		}
		System.out.println("m="+m+", n="+n+", t="+t);
		try {
			System.out.println("即将故意抛出I/O异常");
			throw new java.io.IOException("我是故意的！");
			//System.out.println("这个语句没有机会执行，必须注释，否则编译错误");
		}
		catch(java.io.IOException e) {
			System.out.println("发生异常：");
			System.out.println(e.getMessage());
		}
	}

}
