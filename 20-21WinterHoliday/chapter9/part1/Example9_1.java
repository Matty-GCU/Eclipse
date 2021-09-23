package part1;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

public class Example9_1 {

	public static void main(String[] args) {
		JFrame window1 = new JFrame();
		JFrame window2 = new JFrame("The second window.");
		Container con = window1.getContentPane();
		con.setBackground(Color.yellow);
		window1.setBounds(60, 100, 188, 108);
		window2.setBounds(1000, 600, 500, 400);
		window1.setVisible(true);
		window2.setVisible(true);
		window1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
