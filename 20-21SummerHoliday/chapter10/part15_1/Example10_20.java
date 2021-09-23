package part15_1;

import java.io.*;
import java.util.Scanner;

public class Example10_20 {

	public static void main(String[] args) {
		StandardExam exam = new StandardExam();
		File file = new File("C:\\Users\\Matty's PC\\Desktop\\test.txt");
		exam.setTestFile(file);
		exam.startExam();
	}

}

/*
标准化考试的试题文件（test.txt）文本内容如下：
1.北京奥运会开幕时间？
A.2008-08-08
B.2008-08-01
C.2008-10-1
D.2008-07-08
-----------A------------
2.2021年世界杯在哪里举行？
A.美国
B.英国
C.南非
D.巴西
-----------C------------
*/