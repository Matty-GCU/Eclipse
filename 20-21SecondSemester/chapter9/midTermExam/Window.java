package midTermExam;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
	static JTextField input;
	static JLabel show;
	public static void main(String[] args) {
		Window win = new Window();
		input = new JTextField(5);
		show = new JLabel("û���������롣");
		win.add(input);
		win.add(show);
		input.addActionListener(new MyListener(input,show));
		win.setTitle("����");
		win.setLayout(new FlowLayout());
		
		//1.�α���&��ʦ��
		win.setBounds(50, 50, 200, 100);
//		//2.ʦ�ֵģ���ʵ��2��Ч��һ����
//		win.setSize(win.getPreferredSize());
//		win.pack();
//		//3.���Ƽ��ģ������ڼ򵥵Ĳ��֣����ӵ㻹��Ҫ�õ�һ������ȷ�Զ��壩
//		win.pack();
		win.setVisible(true);
		win.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}

class MyListener implements ActionListener {
	JTextField inputText;
	JLabel showLabel;
	MyListener(JTextField text, JLabel label) {
		inputText = text;
		showLabel = label;
	}
	public void actionPerformed(ActionEvent e) {
		String number = inputText.getText();
		showLabel.setText("�����������:" + number);
//		inputText.setText(null);
	}
}
