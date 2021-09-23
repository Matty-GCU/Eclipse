package part4_3;

import java.awt.*;
import javax.swing.*;

public class WindowOperation extends JFrame {
	JTextField inputNumberOne, inputNumberTwo;
	JComboBox chioceOfOperator;
	JTextArea textShowProcess;
	JButton button;
	OperationListener operatorListener;
	ComputerListener computerListener;
	public WindowOperation() {
		init();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	void init() {
		setLayout(new FlowLayout());
		inputNumberOne = new JTextField(5);
		inputNumberTwo = new JTextField(5);
		String[] operators = {"+", "-", "*", "/"};
		chioceOfOperator = new JComboBox();
		chioceOfOperator.addItem("---—°‘Ò‘ÀÀ„∑˚∫≈---");
		for(String s: operators)
			chioceOfOperator.addItem(s);
		button = new JButton("º∆À„");
		textShowProcess = new JTextArea(9, 30);
		operatorListener = new OperationListener();
		computerListener = new ComputerListener();
		operatorListener.setJComboBox(chioceOfOperator);
		operatorListener.setListenerWorkingTogether(computerListener);
		computerListener.setTextFieldOne(inputNumberOne);
		computerListener.setTextFieldTwo(inputNumberTwo);
		computerListener.setTextArea(textShowProcess);
		chioceOfOperator.addItemListener(operatorListener);
		button.addActionListener(computerListener);
		add(inputNumberOne);
		add(chioceOfOperator);
		add(inputNumberTwo);
		add(button);
		add(new JScrollPane(textShowProcess));
	}
}
