package questionSolved;
import java.util.Scanner;
import static java.lang.System.out;
//利用异或运算的性质，对文字进行加密、解密
public class QS1_Secret {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		int i = 1;
		String line = "=================================";
		out.println("设置加密/解密参数（单字符）：");
		char secret = reader.next().charAt(0);
		while(i != 0) {
			out.println(line);
			out.println("输入想要加密/解密的文字或句子：");
			String input = reader.next();
			char A[] = input.toCharArray();
			out.print("密文/原文：");
			for(char b:A) {
				b = (char)(b^secret);
				out.print(b);
			}
			out.println();
			out.println(line);
			out.println("输入任意数字继续加密/解密，输入0结束程序");
			i = reader.nextInt();
		}
		reader.close();
	}
}
//20.10.19