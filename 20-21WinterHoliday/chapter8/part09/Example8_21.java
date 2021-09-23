package part09;

import java.io.Console;

public class Example8_21 {

	public static void main(String[] args) {
		boolean success = false;
		int count = 0;
		Console cons = System.console();
		//Java.io.Console 只能用在标准输入、输出流未被重定向的原始控制台中使用，
		//在 Eclipse / Idea 或者其他 IDE 的控制台是不可用的。
		char[] password;
		while(true) {
			System.out.print("输入密码：");
			password = cons.readPassword();
			count++;
			String str = new String(password);
			if(str.equals("Thank you for playing my game.")) {
				success = true;
				System.out.println("第"+count+"次密码输入正确！");
				break;
			}
			else {
				System.out.println("第"+count+"次密码输入错误！");
			}
			if(count==3) {
				System.out.println("您"+count+"次密码输入都错误，请稍后再试！");
				System.exit(0);
			}
		}
		if(success) {
			System.out.print("你好，欢迎你！");
		}
	}

}
