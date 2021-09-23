package part15_1;

import java.io.*;
import java.util.Scanner;

public class StandardExam {
	File testFile;
	public void setTestFile(File file) {
		testFile = file;
	}
	public void startExam() {
		int score = 0;
		Scanner sc = new Scanner(System.in);
		try {
			FileReader inOne = new FileReader(testFile);
			BufferedReader inTwo = new BufferedReader(inOne);
			String str = null;
			while((str = inTwo.readLine()) != null) {
				if(! str.startsWith("-")) {
					System.out.println(str);
				}	
				else {
					str = str.replaceAll("-", "");
					String correctAnswer = str;
					System.out.println("填入答案：");
					String answer = sc.nextLine();
					if(correctAnswer.compareToIgnoreCase(answer) == 0) {
						score++;
					}
				}
			}
			inTwo.close();
		}
		catch(IOException e) {}
		System.out.println("最后的分数：" + score);
	 }
}
