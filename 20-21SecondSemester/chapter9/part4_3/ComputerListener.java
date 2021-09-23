package part4_3;

import java.awt.event.*;
import javax.swing.*;

public class ComputerListener implements ActionListener {
	JTextField inputNumberOne, inputNumberTwo;
	JTextArea textShowDetail;
	String operator;
	public void setTextFieldOne(JTextField text) {
		inputNumberOne = text;
	}
	public void setTextFieldTwo(JTextField text) {
		inputNumberTwo = text;
	}
	public void setTextArea(JTextArea text) {
		textShowDetail = text;
	}
	public void setOperator(String str) {
		operator = str;
	}
	public void actionPerformed(ActionEvent e) {
		try {
			double numberOne = Double.parseDouble(inputNumberOne.getText());
			double numberTwo = Double.parseDouble(inputNumberTwo.getText());
			double result = 0;
			if(operator.equals("+"))
				result = numberOne + numberTwo;
			else if(operator.equals("-"))
				result = numberOne - numberTwo;
			else if(operator.equals("*"))
				result = numberOne * numberTwo;
			else if(operator.equals("/"))
				result = numberOne / numberTwo;
			else
				throw new Exception();
			if(numberOne == 1 && numberTwo == 1 && operator.equals("+")) {
				textShowDetail.append(numberOne + operator + numberTwo + "= " + 233 + "\n恭喜你找到彩蛋！ --2021/3/5/23:53\n");
			}
			else {
				textShowDetail.append(numberOne + operator + numberTwo + "= " + result + "\n");
			}
		}catch(Exception exp) {
			textShowDetail.append("非法字符或非法运算符号！！！\n请重试！\n");
		}
	}
}
