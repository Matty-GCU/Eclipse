package part4_5;

import java.awt.event.*;
import javax.swing.*;

public class MousePolice implements MouseListener {
	JTextArea area;
	public void setJTextArea(JTextArea area) {
		this.area = area;
	}
	public void mousePressed(MouseEvent e) {
		area.append("\n��갴�£�λ�ã�" + "(" + e.getX() + "," + e.getY() + ")");
	}
	public void mouseReleased(MouseEvent e) {
		area.append("\n����ͷţ�λ�ã�" + "(" + e.getX() + "," + e.getY() + ")");
	}
	public void mouseEntered(MouseEvent e) {
		if(e.getSource() instanceof JButton) {
			area.append("\n�����밴ť��λ�ã�" + "(" + e.getX() + "," + e.getY() + ")");
		}
		if(e.getSource() instanceof JTextField) {
			area.append("\n�������ı���λ�ã�" + "(" + e.getX() + "," + e.getY() + ")");
		}
		if(e.getSource() instanceof JFrame) {
			area.append("\n�����봰�ڣ�λ�ã�" + "(" + e.getX() + "," + e.getY() + ")");
		}
	}
	public void mouseExited(MouseEvent e) {
		area.append("\n����˳���λ�ã�" + "(" + e.getX() + "," + e.getY() + ")");
	}
	public void mouseClicked(MouseEvent e) {
		if(e.getClickCount() >= 2) {
			area.append("\n���������λ�ã�" + "(" + e.getX() + "," + e.getY() + ")");
		}
	}
}
