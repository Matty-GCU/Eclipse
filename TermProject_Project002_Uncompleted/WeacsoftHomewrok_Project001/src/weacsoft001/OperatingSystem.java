package weacsoft001;

import static myUtil.Printer.*;

import java.util.Scanner;

public class OperatingSystem {

	public static void main(String[] args) {
		ManagementSystem system = new ManagementSystem();
		Scanner sc = new Scanner(System.in);
		p("正在进入系统...");
		p("欢迎使用学生宿舍管理系统！\n风格：MS-DOS\n作者：Matty\n输入HELP命令可查看帮助。\n>>>");
		while(sc.hasNext()) {
			String input = sc.next();
			if(input.equals("help")) {
				p("-help 查看帮助");
				p("-init 系统初始化");
				p("-exit 退出系统");
				p("-print one");
			}
			else if(input.equals("init")) {
				p("开始初始化...");
				p("请按顺序输入每个学生的学号和姓名，中间用空格隔开；输入-1表示完成。");
				system.init();
				p("初始化完毕!");
			}
			else if(input.equals("exit")) {
				p("正在退出系统...");
				p("成功退出！");
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
