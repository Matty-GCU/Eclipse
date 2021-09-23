package part99;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Listener2 implements ActionListener {
	JTextField t1, t2, t3;
	Listener2(JTextField t01, JTextField t02, JTextField t03) {
		t1 = t01;
		t2 = t02;
		t3 = t03;
	}
	public void actionPerformed(ActionEvent e) {
//		JButton button = (JButton)e.getSource();
		int a = 0, b = 0;
		try
		{
			a = Integer.parseInt(t1.getText());
			b = Integer.parseInt(t2.getText());
		}
		catch(NumberFormatException excp) {
			t3.setText("���ָ�ʽ����");
		}
//		if(button.getActionCommand() == "��") {
		if(e.getActionCommand() == "��") {
			t3.setText(a + "+" + b + "=" + (a+b));
		}
		else if(e.getActionCommand() == "��") {
			t3.setText(a + "-" + b + "=" + (a-b));
		}
		else if(e.getActionCommand() == "��") {
			t3.setText(a + "*" + b + "=" + (a*b));
		}
		else if(e.getActionCommand() == "��") {
			if(b == 0) {
				t3.setText("can't by zeros");
			}
			else {
				t3.setText(a + "/" + b + "=" + (a/b));
			}
		}
		t1.setText(null);
		t2.setText(null);
	}

}
