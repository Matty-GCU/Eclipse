package homework;
import java.io.*;

public class CopyPic {
	InputStream in;
	OutputStream out;
	File newPic;
	boolean readyToCopy = false;
	CopyPic(File srcPic, File dstDir) {
		try {
			in = new FileInputStream(srcPic);
			newPic = new File(dstDir.getAbsolutePath(), srcPic.getName());
//			newPic = new File(dstDir.getAbsolutePath(), "b.txt");
			out = new FileOutputStream(newPic);
			if(srcPic.exists() && dstDir.exists() && srcPic.isFile() && dstDir.isDirectory() && newPic.exists()) {
				readyToCopy = true;
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	void copy() {
		if(readyToCopy == false) {
			return;
		}
		byte[] b = new byte[110000];
		try {
			in.read(b);
			out.write(b);
			in.close();
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
