package part99;

import java.awt.*;
import javax.swing.*;

public class Win2 extends JFrame {
	JTextField t1, t2, t3;
	JButton b1, b2, b3, b4;
	Listener2 l1;
	Win2() {
		setLayout(new FlowLayout());
		setVisible(true);
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		b1 = new JButton("¼Ó");
		b2 = new JButton("¼õ");
		b3 = new JButton("³Ë");
		b4 = new JButton("³ý");
		l1 = new Listener2(t1, t2, t3);
		add(t1);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(t3);
		b1.addActionListener(l1);
		b2.addActionListener(l1);
		b3.addActionListener(l1);
		b4.addActionListener(l1);
	}
}
