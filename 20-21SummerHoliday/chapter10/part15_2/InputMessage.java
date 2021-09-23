package part15_2;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InputMessage extends JPanel implements ActionListener {
	File file = null;
	RandomAccessFile out;
	Box baseBox, boxV1, boxV2;
	JTextField name, email, phone;
	JButton button;
	InputMessage(File f) {
		setBackground(Color.cyan);
		file = f;
		name = new JTextField(12);
		email = new JTextField(12);
		phone = new JTextField(12);
		button = new JButton("Save");
		button.addActionListener(this);
		
		boxV1 = Box.createVerticalBox();
		
		boxV1.add(new JLabel("Input name"));
		boxV1.add(Box.createVerticalStrut(12));		//添加垂直支撑，参数单位为像素点
//		boxV1.add(Box.createHorizontalStrut(0));
		boxV1.add(new JLabel("Input email"));
//		boxV1.add(Box.createHorizontalStrut(0));
		boxV1.add(Box.createVerticalStrut(12));
		boxV1.add(new JLabel("Input phone"));
//		boxV1.add(Box.createHorizontalStrut(0));
		boxV1.add(Box.createVerticalStrut(12));
		boxV1.add(new JLabel("Click to save"));
		
		boxV2 = Box.createVerticalBox();
		
		boxV2.add(name);
		boxV2.add(Box.createVerticalStrut(8));
		boxV2.add(email);
		boxV2.add(Box.createVerticalStrut(8));
		boxV2.add(phone);
		boxV2.add(Box.createVerticalStrut(8));
		boxV2.add(button);
		
		baseBox = Box.createHorizontalBox();
		baseBox.add(boxV1);
		baseBox.add(Box.createHorizontalStrut(10));
		baseBox.add(boxV2);
		add(baseBox);
	}
	public void actionPerformed(ActionEvent e) {
		try {
			RandomAccessFile out = new RandomAccessFile(file, "rw");
			if(file.exists()) {
				long length = file.length();
				out.seek(length);
			}
			out.writeUTF("Name:" + name.getText());
			out.writeUTF("Email:" + email.getText());
			out.writeUTF("Phone:" + phone.getText());
			out.close();
		}
		catch(IOException e2) {}
	}
}
