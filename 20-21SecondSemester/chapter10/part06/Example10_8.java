package part06;

import java.io.*;

public class Example10_8 {

	public static void main(String[] args) {
		RandomAccessFile inAndOut;
		int[] data = {1,2,3,4,5,6,7,8,9,10};
		try
		{
			inAndOut = new RandomAccessFile("C:\\Users\\Matty's PC\\Desktop\\T.txt", "rw");
			for(int i = 0; i < data.length; i++) {
				System.out.println("***" + inAndOut.getFilePointer());
				inAndOut.writeInt(data[i]);
			}
			for(int i = data.length-1; i >= 0; i--) {
				inAndOut.seek(i*4);
				System.out.println("i: " +i);
				System.out.println("^^^" + inAndOut.getFilePointer());
				System.out.println(inAndOut.readInt());
			}
			inAndOut.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
			System.out.println("Error");
		}
	}

}
