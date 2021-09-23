package part3;

import javax.swing.*;

public class WindowBoxLayout extends JFrame {
	Box boxH;				//行式盒
	Box boxV1, boxV2;		//列式盒
	public WindowBoxLayout() {
		setLayout(new java.awt.FlowLayout());
		init();
		setVisible(true);
	}
	void init() {
		boxH = Box.createHorizontalBox();
		boxV1 = Box.createVerticalBox();
		boxV2 = Box.createVerticalBox();
		boxV1.add(new JLabel("姓名:"));
		boxV1.add(new JTextField(10));
		boxV2.add(new JLabel("职业:"));
		boxV2.add(new JTextField(10));
		boxH.add(boxV1);
		boxH.add(Box.createHorizontalStrut(10));
		boxH.add(boxV2);
		add(boxH);
	}
}
