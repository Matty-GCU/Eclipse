package part4_7;

import java.awt.event.*;
import javax.swing.*;

public class Police implements KeyListener, FocusListener {
	public void keyPressed(KeyEvent e) {
		JTextField texField = (JTextField) e.getSource();
		if(texField.getCaretPosition() >= 6) {		//index
			texField.transferFocus();
		}
	}
	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}
	
	public void focusGained(FocusEvent e) {
		JTextField textField = (JTextField) e.getSource();
		textField.setText(null);
	}
	public void focusLost(FocusEvent e) {}
}
