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
		show = new JLabel("没有数字输入。");
		win.add(input);
		win.add(show);
		input.addActionListener(new MyListener(input,show));
		win.setTitle("计算");
		win.setLayout(new FlowLayout());
		
		//1.课本的&老师的
		win.setBounds(50, 50, 200, 100);
//		//2.师兄的（其实和2的效果一样）
//		win.setSize(win.getPreferredSize());
//		win.pack();
//		//3.我推荐的（适用于简单的布局，复杂点还是要用第一个来精确自定义）
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
		showLabel.setText("输入的数字是:" + number);
//		inputText.setText(null);
	}
}
