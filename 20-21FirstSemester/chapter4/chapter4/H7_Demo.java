package chapter4;
import java.util.Scanner;

public class H7_Demo {
	public static void main(String[] args) {
		H7_Student Wang = new H7_Student("001", "����", "�������ѧ�뼼��"); 
		Scanner reader = new Scanner(System.in);
		String name = reader.next();
		String majoy = reader.next();
		if(Wang.search(name, majoy) == true) {
			System.out.println("��������");
		}
		else {
			System.out.println("���޴���");
		}
		reader.close();
	}
}
//20201209