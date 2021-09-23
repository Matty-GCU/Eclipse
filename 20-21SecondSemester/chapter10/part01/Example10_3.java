package part01;

import java.io.File;
import java.io.IOException;
import java.lang.Runtime;

public class Example10_3 {

	public static void main(String[] args) throws IOException {
//		File f = new File("C:\\IOTest\\TTT.txt");
//		File f2 = new File("C:\\IOTest\\TTT3.mp4");
//		System.out.println(f.exists());
//		System.out.println(f.getAbsolutePath());
//		f.delete();
//		System.out.println(f.exists());
//		System.out.println(f.getAbsolutePath());
//		System.out.println(f2.exists());
//		System.out.println(f2.getAbsolutePath());
//		f2.createNewFile();
//		System.out.println(f2.exists());
//		System.out.println(f2.getAbsolutePath());
		try
		{
			File f = new File("C:\\windows\\Notepad.exe");
//			File f = new File("C:/windows", "Notepad.exe");
			Runtime r = Runtime.getRuntime();
			r.exec(f.getAbsolutePath());
			f = new File("C:\\Programe Files\\Internet Explorer", "IEXPLORE www.baidu.com");
			r.exec(f.getAbsolutePath());
		}
		catch(IOException e)
		{
			
		}
	}

}
