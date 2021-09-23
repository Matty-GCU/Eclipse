package part4_3;

import java.awt.event.*;
import javax.swing.*;

public class OperationListener implements ItemListener {
	JComboBox chioceBox;
	ComputerListener listenerWorkingTogerther;
	public void setJComboBox(JComboBox box) {
		chioceBox = box;
	}
	public void setListenerWorkingTogether(ComputerListener listener) {
		listenerWorkingTogerther = listener;
	}
	public void itemStateChanged(ItemEvent e) {
		String operator = chioceBox.getSelectedItem().toString();
		listenerWorkingTogerther.setOperator(operator);
	}
}
