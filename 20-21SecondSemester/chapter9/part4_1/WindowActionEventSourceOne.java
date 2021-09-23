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
		listener = new ReaderListener();		//����������
		text.addActionListener(listener);		//text��listenerע��Ϊ�Լ��ļ�����
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
