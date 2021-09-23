package part4_9;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example9_14 {

	public static void main(String[] args) {
		WindowButton win = new WindowButton("猜数字");
	}

}

class WindowButton extends JFrame implements ActionListener {
	int number;
	JLabel hintLabel;
	JTextField inputGuess;
	JButton buttonGetNumber, buttonConfirm;
	WindowButton(String title) {
		super(title);
		addWindowListener(new WindowAdapter() {		//适配器类的匿名子类的实例监视窗口事件
				public void windowClosing(WindowEvent e) {
					dispose();
				}
			}
		);
		buttonGetNumber = new JButton("得到一个随机数");
		add(buttonGetNumber);
		setLayout(new FlowLayout());
		hintLabel = new JLabel("输入你的猜测: ", JLabel.LEFT);
		hintLabel.setBackground(Color.RED);
		inputGuess = new JTextField("0", 10);
		add(hintLabel);
		add(inputGuess);
		buttonConfirm = new JButton("确定");
		add(buttonConfirm);
		buttonConfirm.addActionListener(this);		//窗口做监视器
		buttonGetNumber.addActionListener(this);
		setBounds(100, 100, 200, 350);
		setVisible(true);
//		validate();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttonGetNumber) {
			number = (int)(Math.random() * 10 + 1);
			hintLabel.setText("输入你的猜测");
		}
		else if(e.getSource() == buttonConfirm) {
			int guessNumber = 0;
			try
			{
				guessNumber = Integer.parseInt(inputGuess.getText());
				if(guessNumber == number) {
					hintLabel.setText("你猜对了！");
				}
				else if(guessNumber > number) {
					hintLabel.setText("你猜大了！");
				}
				else if(guessNumber < number) {
					hintLabel.setText("你猜小了！");
				}
			}
			catch(NumberFormatException event)
			{
				hintLabel.setText("请输入数字字符！");
			}
		}
	}
}