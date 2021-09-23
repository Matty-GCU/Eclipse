package part04;

import java.io.*;
import java.util.Arrays;

public class Example10_6 {

	public static void main(String[] args) {
		File sourceFile = new File("C:\\Users\\Matty's PC\\Desktop\\TestIn.txt");
		File targetFile = new File("C:\\Users\\Matty's PC\\Desktop\\TestOut.txt");
		char[] c = new char[2];
		try
		{
			Reader in = new FileReader(sourceFile);
			Writer out = new FileWriter(targetFile);
			int n = -1;
			while( (n=in.read(c, 0, 2)) != -1 ) {
				System.out.println(new String(c));
				out.write(c, 0, n);						//改成n+1会多写一个空字符
			}
			out.flush();
			out.close();
		}
		catch(IOException e) {
			e.printStackTrace();
			System.out.println("Error");
		}
	}

}
