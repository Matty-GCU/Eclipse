package part06;

import java.io.*;
import java.util.Arrays;

public class Example10_9 {

	public static void main(String[] args) {
		RandomAccessFile in;
		File file = new File("C:\\Users\\Matty's PC\\Desktop\\TestIn.txt");
		try
		{
			in = new RandomAccessFile(file, "rw");
			long length = in.length();
			long position = 0;
			in.seek(position);
			while(position < length) {
				String str = in.readLine();
				System.out.println("***   " + str);
				byte[] b = str.getBytes("iso-8859-1");
				str = new String(b);
				System.out.println("---   " + str);
			}
		}
		catch(IOException e) {}
	}

}

