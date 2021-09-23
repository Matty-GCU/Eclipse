package chapter9.part11;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;

public class Person extends JButton implements FocusListener{		//JButton是可以触发FocusEvent的组件
	int number;		//人物编号&人物数组下标
	String name;
	Color color = new Color(255, 245, 170);
	Font font = new Font("楷体", Font.BOLD, 14);
	Person(int num, String str) {
		super(str);
		number = num;
		name = str;
		setBackground(color);
		setFont(font);
		addFocusListener(this);
	}
	//选中时为红色，未选中或取消选中时为原来的颜色
	public void focusGained(FocusEvent e) {
		setBackground(Color.RED);
	}
	public void focusLost(FocusEvent e) {
		setBackground(color);
	}
}
