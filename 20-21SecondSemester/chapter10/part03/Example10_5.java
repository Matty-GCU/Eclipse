package part03;

import java.util.Arrays;
import java.io.*;

public class Example10_5 {

	public static void main(String[] args) {
		byte[] a = "新年快乐！".getBytes();		//读中文？
		byte[] b = "Happy New Year!".getBytes();
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		File file = new File("C:\\Users\\Matty's PC\\Desktop\\TT.txt");
		try
		{
			System.out.println(file.getName() + "的大小" + file.length() + "字节");		//10abc
			OutputStream output = new FileOutputStream(file);
			System.out.println(file.getName() + "的大小" + file.length() + "字节");		//0Nothing
			output.write(a);
			System.out.println(file.getName() + "的大小" + file.length() + "字节");		//10新年
			output.close();
			output = new FileOutputStream(file, true);
			System.out.println(file.getName() + "的大小" + file.length() + "字节");		//10新年
			output.write(b);
			System.out.println(file.getName() + "的大小" + file.length() + "字节");		//10+15新年New
			output.close();
		}
		catch(IOException e) {
			System.out.println("IOException");
		}
	}

}
