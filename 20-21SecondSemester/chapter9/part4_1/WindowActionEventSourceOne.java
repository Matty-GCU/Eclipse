package part4_1;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class WindowActionEventSourceOne extends JFrame {
	JTextField text;
	ActionListener listener;
	public WindowActionEventSourceOne() {
		setLayout(new FlowLayout());
		text = new JTextField(10);
		add(text);
		listener = new ReaderListener();		//创建监视器
		text.addActionListener(listener);		//text将listener注册为自己的监视器
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
