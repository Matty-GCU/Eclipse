package part4_2;

import javax.swing.*;

import java.awt.*;

public class WindowActionEventSourceTwo extends JFrame {
	JTextField textInput;
	JTextArea textShow;
	JButton button;
	MyCommandListener listener;
	public WindowActionEventSourceTwo() {
		init();
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	void init() {
		setLayout(new FlowLayout());
		textInput = new JTextField(10);
		button = new JButton("È·¶¨");
		textShow = new JTextArea(9, 30);
		add(textInput);
		add(button);
		add(textShow);
	}
	void setCommandListener(MyCommandListener listener) {
		this.listener = listener;
		listener.setJTextField(textInput);
		listener.setJextArea(textShow);
		textInput.addActionListener(listener);
		button.addActionListener(listener);
	}
}
