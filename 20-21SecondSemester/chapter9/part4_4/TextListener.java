package part4_4;

import java.util.Arrays;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class TextListener implements DocumentListener{
	JTextArea inputText, showText;
	public void setInputText(JTextArea text) {
		inputText = text;
	}
	public void setShowText(JTextArea text) {
		showText = text;
	}
	public void changedUpdate(DocumentEvent e) {
		String str = inputText.getText();
		String regex = "[\\s\\d\\p{Punct}]+";		//数字、空格、标点符号
		String[] words = str.split(regex);
		Arrays.sort(words);
		showText.setText(null);		//JTextComponent的方法
		for(int i = 0; i < words.length; i++) {
			showText.append(words[i] + ",");
		}
	}
	public void removeUpdate(DocumentEvent e) {
		changedUpdate(e);
	}
	public void insertUpdate(DocumentEvent e) {
		changedUpdate(e);
	}
}
