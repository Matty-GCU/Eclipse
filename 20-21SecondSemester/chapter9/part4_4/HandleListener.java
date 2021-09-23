package part4_4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

public class HandleListener implements ActionListener {
	JTextArea inputText, showText;
	public void setInputText(JTextArea text) {
		inputText = text;
	}
	public void setShowText(JTextArea text) {
		showText = text;
	}
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		//下面的if-else中的对象，书中例子写错了（P244）
		if(str.equals("Copy")){
			inputText.copy();		//cut()
		}
		else if(str.equals("Cut"))
			inputText.cut();
		else if(str.equals("Paste"))
			showText.paste();
	}
}
