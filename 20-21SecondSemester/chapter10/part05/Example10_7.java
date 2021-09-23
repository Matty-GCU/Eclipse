package part05;

import java.io.*;
import java.util.*;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class Example10_7 {
	public static void main(String[] args) {
		File fileRead = new File("C:\\Users\\Matty's PC\\Desktop\\a.txt");
		File fileWrite = new File("C:\\Users\\Matty's PC\\Desktop\\b.txt");
		try
		{
			Reader in = new FileReader(fileRead);
			Writer out = new FileWriter(fileWrite);
			BufferedReader bufferedReader = new BufferedReader(in);
			BufferedWriter bufferedWriter = new BufferedWriter(out);
			String str = null;
			while( (str=bufferedReader.readLine()) != null ) {
				StringTokenizer tokenizer = new StringTokenizer(str);
				int count = tokenizer.countTokens();
				str = str+"句子中单词个数：" + count;
				bufferedWriter.write(str);
				bufferedWriter.newLine();
			}
			bufferedWriter.close();
//			out.close();
			in = new FileReader(fileWrite);
			bufferedReader = new BufferedReader(in);
			String s = null;
			System.out.println(fileWrite.getName() + "内容:");
			while( (s=bufferedReader.readLine()) != null ) {
				System.out.println(s);
			}
			bufferedReader.close();
//			in.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
