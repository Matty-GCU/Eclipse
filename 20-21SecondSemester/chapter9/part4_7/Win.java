package part4_7;

import java.awt.*;
import javax.swing.*;

public class Win extends JFrame {
	JTextField[] textFields = new JTextField[3];
	Police police;
	JButton button;
	Win() {
		setLayout(new FlowLayout());
		police = new Police();
		for(int i = 0; i < textFields.length; i++) {
			textFields[i] = new JTextField(7);
			textFields[i].addKeyListener(police);
			textFields[i].addFocusListener(police);
			add(textFields[i]);
		}
		button = new JButton("È·¶¨");
		add(button);
		textFields[0].requestFocusInWindow();
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(10, 10, 100, 100);
	}
}
