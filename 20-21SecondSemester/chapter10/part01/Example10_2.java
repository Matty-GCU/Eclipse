package part01;

import java.io.*;
import java.util.Arrays;

public class Example10_2 {

	public static void main(String[] args) {
		File directoryFile = new File("C:\\eclipse-java-mars-win32\\workspace\\03SecondSemester\\chapter10\\part01", ".");
		System.out.println(Arrays.toString(directoryFile.list()));
//		File[] files = directoryFile.listFiles();
//		for(File f: files) {
//			System.out.println(f.getName());
//		}
		FileAccept fileAccept = new FileAccept();
		fileAccept.setExtendName("java");		//.java
		String[] filename = directoryFile.list(fileAccept);
		for(String s: filename) {
			System.out.println(s);
		}
	}

}
class FileAccept implements FilenameFilter {
	private String extendName;
	public void setExtendName(String s) {
		extendName = "." + s;
	}
	public boolean accept(File dir, String name) {
		System.out.println(dir);
		return name.endsWith(extendName);
	}
}
