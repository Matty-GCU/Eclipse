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
��׼�����Ե������ļ���test.txt���ı��������£�
1.�������˻ῪĻʱ�䣿
A.2008-08-08
B.2008-08-01
C.2008-10-1
D.2008-07-08
-----------A------------
2.2021�����籭��������У�
A.����
B.Ӣ��
C.�Ϸ�
D.����
-----------C------------
*/