package part02;

import java.io.*;

public class Example10_4 {

	public static void main(String[] args) {
		int n = -1;
		byte[] b = new byte[100];
		try
		{
			File file = new File("C:\\Users\\Matty's PC\\Desktop", "T.txt");
			InputStream input = new FileInputStream(file);
			while((n = input.read(b, 0, 2)) != -1) {  	//赋值语句的返回值就是最新值
				String str = new String(b, 0, n);
				System.out.println(str);
			}
			input.close();
		}
		catch(IOException e) {
			System.out.println("File read Error" + e);
		}
	}

}
