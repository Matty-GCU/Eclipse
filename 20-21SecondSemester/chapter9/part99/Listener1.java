package part99;

import java.util.Scanner;

import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Listener1 implements DocumentListener {
	JTextArea t1, t2;
	Listener1(JTextArea t01, JTextArea t02) {
		t1 = t01;
		t2 = t02;
	}
	public void insertUpdate(DocumentEvent e) {
		changedUpdate(e);
	}
	public void removeUpdate(DocumentEvent e) {
		changedUpdate(e);
	}
	public void changedUpdate(DocumentEvent e) {
		String str = t1.getText();
		int a = 0, sum = 0;
		Scanner sc = new Scanner(str);
		sc.useDelimiter("[^0123456789.]+");
		while(sc.hasNext()) {
			a++;
			sum += sc.nextInt();
		}
		t2.setText(null);
		t2.append("sum = " + sum + ", avg:" + sum/a);
	}

}
