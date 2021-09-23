package part3;

import java.awt.*;
import javax.swing.*;

public class ComponentInWindow extends JFrame {
	JCheckBox checkBox1, checkBox2;		//复选框
	JRadioButton radioM, radioF;		//单选框
	JComboBox<String> comBox;			//下拉列表
	ButtonGroup group;
	public ComponentInWindow() {
		init();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void init() {
		FlowLayout flowLayout = new FlowLayout();
		setLayout(flowLayout);
		comBox = new JComboBox<String>();
		checkBox1 = new JCheckBox("90后");
		checkBox2 = new JCheckBox("00后");
		group = new ButtonGroup();
		radioM = new JRadioButton("Male");
		radioF = new JRadioButton("Female");
		group.add(radioM);
		group.add(radioF);		//归组才能实现单选
		add(checkBox1);
		add(checkBox2);
		add(radioM);
		add(radioF);
		comBox.addItem("Love music.");
		comBox.addItem("Love movie.");
		add(comBox);
		
		JTextArea textArea = new JTextArea(4, 30);
		JPasswordField passwordField = new JPasswordField(30);
		JTextField textField = new JTextField(30);
		JLabel labelOne = new JLabel("账号：");
		JLabel labelTwo = new JLabel("密码：");
		JButton button = new JButton("我是按钮");
		button.setPreferredSize(new Dimension(200,50));
		add(labelOne);
		add(textField);
		add(labelTwo);
		add(passwordField);
		add(textArea);
		add(button);
		flowLayout.setAlignment(FlowLayout.RIGHT);
		CardLayout card = new CardLayout();
	}
}
