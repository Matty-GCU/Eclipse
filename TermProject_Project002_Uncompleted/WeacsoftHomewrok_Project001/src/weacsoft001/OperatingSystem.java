package weacsoft001;

import static myUtil.Printer.*;

import java.util.Scanner;

public class OperatingSystem {

	public static void main(String[] args) {
		ManagementSystem system = new ManagementSystem();
		Scanner sc = new Scanner(System.in);
		p("���ڽ���ϵͳ...");
		p("��ӭʹ��ѧ���������ϵͳ��\n���MS-DOS\n���ߣ�Matty\n����HELP����ɲ鿴������\n>>>");
		while(sc.hasNext()) {
			String input = sc.next();
			if(input.equals("help")) {
				p("-help �鿴����");
				p("-init ϵͳ��ʼ��");
				p("-exit �˳�ϵͳ");
				p("-print one");
			}
			else if(input.equals("init")) {
				p("��ʼ��ʼ��...");
				p("�밴˳������ÿ��ѧ����ѧ�ź��������м��ÿո����������-1��ʾ��ɡ�");
				system.init();
				p("��ʼ�����!");
			}
			else if(input.equals("exit")) {
				p("�����˳�ϵͳ...");
				p("�ɹ��˳���");
				System.exit(0);
			}
			p(">>>");
		}
//		system.init();
//		system.printAll();
//		system.printOne(system.searchById("3"));
//		system.printOne(system.searchByName("Hu"));
//		system.modifyIdByName("Li", "333");
//		system.printAll();
//		system.modifyNameById("1", "Wu Hang");
//		system.printAll();
	}

}
