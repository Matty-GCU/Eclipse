package part3;

import javax.swing.*;

public class PanelNullLayout extends JPanel {
	JButton button;		//组件
	JTextField text;	//组件
	public PanelNullLayout() {
		setLayout(null);
		text = new JTextField();
		button = new JButton("Confirm");
		add(text);
		add(button);
		text.setBounds(100, 100, 400, 300);
		button.setBounds(100, 100, 400, 300);
	}
}
