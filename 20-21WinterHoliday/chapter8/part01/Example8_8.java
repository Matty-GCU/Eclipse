package part01;
import java.util.Scanner;
public class Example8_8 {

	public static void main(String[] args) {
		String sourceString = "����ʮ�����";
		EncryptAndDecrypt person = new EncryptAndDecrypt();
		System.out.println("������������������֣�"+sourceString);
		Scanner reader = new Scanner(System.in);
		String password = reader.nextLine();
		String secret = person.encrypt(sourceString, password);
		System.out.println("���ģ�"+secret);
		System.out.println("�����������");
		password = reader.nextLine();
		String source = person.decrypt(secret, password);
		System.out.println("���ģ�"+source);
		reader.close();
	}

}
