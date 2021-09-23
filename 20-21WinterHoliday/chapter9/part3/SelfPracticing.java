package part3;

import java.awt.Dimension;

import javax.swing.*;

public class SelfPracticing {

	public static void main(String[] args) {
		JButton a = new JButton("A");
		JButton b = new JButton("B");
		JFrame window = new JFrame("学习窗格的窗口");		//底层容器
		window.setBounds(50, 50, 500, 300);
		window.setVisible(true);
		JTabbedPane tabbedPane = new JTabbedPane();		//中间容器
		window.add(tabbedPane);
		JScrollPane scrollPane = new JScrollPane(new JTextArea("往下写就会出现滚动条")); 
		tabbedPane.add("滚动窗格", scrollPane);
		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, true, a, b);
		tabbedPane.add("拆分窗格", splitPane);
		
		JFrame window1 = new JFrame("学习窗格的窗口1");		//底层容器
		window1.setBounds(50, 50, 500, 300);
		JTabbedPane tabbedPane1 = new JTabbedPane();		//中间容器
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 50, 50);
		layeredPane.add(new JTextArea(), JLayeredPane.DRAG_LAYER);
		layeredPane.add(new JButton("C"), JLayeredPane.DEFAULT_LAYER);
		tabbedPane1.add("分层窗格", layeredPane);
		window1.add(tabbedPane1);
		window1.setVisible(true);
		window1.validate();
	}

}
