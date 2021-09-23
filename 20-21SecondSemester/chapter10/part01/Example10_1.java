package part01;

import java.io.File;
import java.io.IOException;
import static myUtil.Printer.*;

public class Example10_1 {
	public static void main(String[] args) {
		File file = new File("C:\\eclipse-java-mars-win32\\workspace\\3 Second Semester 20-21\\chapter10\\part01", "Example10_1.java");
//		System.out.println(f.getName());
//		System.out.println(f.canRead());
//		System.out.println(f.canWrite());
//		System.out.println(f.exists());
//		System.out.println(f.length());
//		System.out.println(f.getAbsolutePath());
//		System.out.println(f.getParent());
//		System.out.println(f.isFile());
//		System.out.println(f.isDirectory());
//		System.out.println(f.isHidden());
//		long modifiedSince = ((System.currentTimeMillis() - f.lastModified()) / (1000*60));		//minutes
//		System.out.println(modifiedSince);
		
		File newFile = new File(file.getParent(), "hahaha.txt");
		if(! newFile.exists()) {
			try
			{
				System.out.println(555);
				System.out.println(newFile.createNewFile());
				System.out.println(666);
				System.out.println("ÔÚ" + file.getParent() + "³¢ÊÔ´´½¨");
				System.out.println(newFile.exists());
			}
			catch(IOException e) {
				p("IOException");
				e.printStackTrace();
			}
		}
	}
}
