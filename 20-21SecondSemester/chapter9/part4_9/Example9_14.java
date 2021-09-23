package part4_9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example9_14 {

	public static void main(String[] args) {
		WindowButton win = new WindowButton("������");
	}

}

class WindowButton extends JFrame implements ActionListener {
	int number;
	JLabel hintLabel;
	JTextField inputGuess;
	JButton buttonGetNumber, buttonConfirm;
	WindowButton(String title) {
		super(title);
		addWindowListener(new WindowAdapter() {		//������������������ʵ�����Ӵ����¼�
				public void windowClosing(WindowEvent e) {
					dispose();
				}
			}
		);
		buttonGetNumber = new JButton("�õ�һ�������");
		add(buttonGetNumber);
		setLayout(new FlowLayout());
		hintLabel = new JLabel("������Ĳ²�: ", JLabel.LEFT);
		hintLabel.setBackground(Color.RED);
		inputGuess = new JTextField("0", 10);
		add(hintLabel);
		add(inputGuess);
		buttonConfirm = new JButton("ȷ��");
		add(buttonConfirm);
		buttonConfirm.addActionListener(this);		//������������
		buttonGetNumber.addActionListener(this);
		setBounds(100, 100, 200, 350);
		setVisible(true);
//		validate();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttonGetNumber) {
			number = (int)(Math.random() * 10 + 1);
			hintLabel.setText("������Ĳ²�");
		}
		else if(e.getSource() == buttonConfirm) {
			int guessNumber = 0;
			try
			{
				guessNumber = Integer.parseInt(inputGuess.getText());
				if(guessNumber == number) {
					hintLabel.setText("��¶��ˣ�");
				}
				else if(guessNumber > number) {
					hintLabel.setText("��´��ˣ�");
				}
				else if(guessNumber < number) {
					hintLabel.setText("���С�ˣ�");
				}
			}
			catch(NumberFormatException event)
			{
				hintLabel.setText("�����������ַ���");
			}
		}
	}
}