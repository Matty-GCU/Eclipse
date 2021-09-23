package homework;

import java.io.*;

public class H1 {
	
	public static void main(String[] args) {
		File srcPic = new File("C:\\Users\\Matty's PC\\Desktop\\a.jpeg");
		File dstDir = new File("C:\\Users\\Matty's PC\\Desktop\\b");
		CopyPic copyPic = new CopyPic(srcPic, dstDir);
		copyPic.copy();
	}

}
