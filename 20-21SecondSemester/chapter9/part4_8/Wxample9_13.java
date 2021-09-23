package part4_8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Wxample9_13 {

	public static void main(String[] args) {
		new MyFrame("窗口");
	}

}

class MyWindowListener extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.out.println("正在关闭");
		System.exit(0);
		System.out.println("已经关闭");		//unreachable
	}
}

class MyFrame extends JFrame {
	MyWindowListener police;
	MyFrame(String s) {
		super(s);
		police = new MyWindowListener();
		setBounds(100, 100, 200, 300);
		setVisible(true);
		addWindowListener(police);
	}
}