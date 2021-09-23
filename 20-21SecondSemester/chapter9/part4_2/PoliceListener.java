package part4_2;

import java.awt.event.*;
import javax.swing.*;

public class PoliceListener implements MyCommandListener {
	JTextField textInput;
	JTextArea textShow;
	public void setJTextField(JTextField text) {
		this.textInput = text;
		
	}
	public void setJextArea(JTextArea area) {
		this.textShow = area;
	}
	public void actionPerformed(ActionEvent e) {
		String str = textInput.getText();
		textShow.append(str + "µÄ³¤¶È: " + str.length() + "\n");
	}

}
