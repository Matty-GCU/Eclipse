package part99;

import javax.swing.*;
import java.awt.*;

public class Win1 extends JFrame {
	JTextArea t1, t2;
	Listener1 l1;
	Win1() {
		init();
		setVisible(true);
	}
	void init() {
		setLayout(new FlowLayout());
		t1 = new JTextArea(10, 30);
		t2 = new JTextArea(10, 30);
		l1 = new Listener1(t1, t2);
		t1.getDocument().addDocumentListener(l1);
		add(t1);
		add(t2);
	}
}
