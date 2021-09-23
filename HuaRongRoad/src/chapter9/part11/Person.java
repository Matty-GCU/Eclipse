package chapter9.part11;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;

public class Person extends JButton implements FocusListener{		//JButton�ǿ��Դ���FocusEvent�����
	int number;		//������&���������±�
	String name;
	Color color = new Color(255, 245, 170);
	Font font = new Font("����", Font.BOLD, 14);
	Person(int num, String str) {
		super(str);
		number = num;
		name = str;
		setBackground(color);
		setFont(font);
		addFocusListener(this);
	}
	//ѡ��ʱΪ��ɫ��δѡ�л�ȡ��ѡ��ʱΪԭ������ɫ
	public void focusGained(FocusEvent e) {
		setBackground(Color.RED);
	}
	public void focusLost(FocusEvent e) {
		setBackground(color);
	}
}
