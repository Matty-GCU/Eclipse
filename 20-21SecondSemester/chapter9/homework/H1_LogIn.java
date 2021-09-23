package homework;

import java.awt.*;
import javax.swing.*;

public class H1_LogIn {
	public static void main(String[] args) {
		LoginWindow win = new LoginWindow("登录窗口", 100, 100, 500, 600);
	}
}

class LoginWindow extends JFrame {
	LoginWindow(String s, int x, int y, int length, int width) {
		init(s);
		setBounds(x, y, length, width);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	void init(String s) {
		setTitle(s);
		JMenuBar menubar = new JMenuBar();
		setJMenuBar(menubar);
		JMenu menu = new JMenu("选择身份");
		JLabel name = new JLabel("姓名：");
		JLabel password = new JLabel("密码：");
		JTextField inputName = new JTextField(12); 
		JTextField inputPassword = new JTextField(12);
		JMenuItem student = new JMenuItem("学生", new ImageIcon("a.gif"));
		JMenuItem teacher = new JMenuItem("教师");
		JMenuItem manager = new JMenuItem("管理员");
		JButton confirm = new JButton("登录");
		menubar.add(menu);
		menu.add(student);
		menu.add(teacher);
		menu.add(manager);
		menubar.add(menu);
		add(name);
		add(inputName);
		add(password);
		add(inputPassword);
		add(confirm);
		setLayout(new FlowLayout());
	}
}