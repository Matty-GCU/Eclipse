package part4_5;

import java.awt.*;
import javax.swing.*;

public class WindowMouse extends JFrame {
	JTextField text;
	JButton button;
	JTextArea textArea;
	MousePolice police;
	WindowMouse() {
		init();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	void init() {
		FlowLayout flow = new FlowLayout();
		flow.setAlignment(FlowLayout.LEFT);
		setLayout(flow);		//必须用setLayout()告诉组件怎么排布布局，否则就算添加组件了也不会排布出来展示
		police = new MousePolice();
		textArea = new JTextArea(15, 28);
		police.setJTextArea(textArea);
		text = new JTextField(8);
		text.addMouseListener(police);
		button = new JButton();
		button.addMouseListener(police);
		addMouseListener(police);
		add(button);
		add(text);
		add(new JScrollPane(textArea));
	}
}
