package part09;

import java.io.Console;

public class Example8_21 {

	public static void main(String[] args) {
		boolean success = false;
		int count = 0;
		Console cons = System.console();
		//Java.io.Console ֻ�����ڱ�׼���롢�����δ���ض����ԭʼ����̨��ʹ�ã�
		//�� Eclipse / Idea �������� IDE �Ŀ���̨�ǲ����õġ�
		char[] password;
		while(true) {
			System.out.print("�������룺");
			password = cons.readPassword();
			count++;
			String str = new String(password);
			if(str.equals("Thank you for playing my game.")) {
				success = true;
				System.out.println("��"+count+"������������ȷ��");
				break;
			}
			else {
				System.out.println("��"+count+"�������������");
			}
			if(count==3) {
				System.out.println("��"+count+"���������붼�������Ժ����ԣ�");
				System.exit(0);
			}
		}
		if(success) {
			System.out.print("��ã���ӭ�㣡");
		}
	}

}
