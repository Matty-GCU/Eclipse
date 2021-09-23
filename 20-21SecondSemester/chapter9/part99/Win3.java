package part99;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Win3 extends JFrame implements ActionListener{
	JTextField t1, t2, t3;
	JTextArea t4;
	JLabel l1, l2, l3, l4;
	JButton b;
	Trapezoid trapezoid;
	Win3() {
		t1 = new JTextField(5);
		t2 = new JTextField(5);
		t3 = new JTextField(5);
		t4 = new JTextArea(10,15);
		l1 = new JLabel("�ϵף�");
		l2 = new JLabel("�µף�");
		l3 = new JLabel("�ߣ�");
		l4 = new JLabel("�����");
		b = new JButton("����");
		b.addActionListener(this);
		add(l1);add(t1);add(l2);add(t2);add(l3);add(t3);add(l4);add(t4);add(b);
		setVisible(true);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		pack();
	}

	public void actionPerformed(ActionEvent e) {
		double a = Double.parseDouble(t1.getText());
		double b = Double.parseDouble(t2.getText());
		double c = Double.parseDouble(t3.getText());
		trapezoid = new Trapezoid(a, b, c);
		double area = trapezoid.giveArea();
		t4.append("�ϵ�"+a+"�µ�"+b+"��"+c+"�����ε������"+area);
	}
}
