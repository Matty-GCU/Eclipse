package homework;

import java.awt.*;
import javax.swing.*;

public class H1_LogIn {
	public static void main(String[] args) {
		LoginWindow win = new LoginWindow("��¼����", 100, 100, 500, 600);
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
		JMenu menu = new JMenu("ѡ�����");
		JLabel name = new JLabel("������");
		JLabel password = new JLabel("���룺");
		JTextField inputName = new JTextField(12); 
		JTextField inputPassword = new JTextField(12);
		JMenuItem student = new JMenuItem("ѧ��", new ImageIcon("a.gif"));
		JMenuItem teacher = new JMenuItem("��ʦ");
		JMenuItem manager = new JMenuItem("����Ա");
		JButton confirm = new JButton("��¼");
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