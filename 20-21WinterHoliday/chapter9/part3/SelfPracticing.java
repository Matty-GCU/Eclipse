package part3;

import java.awt.Dimension;

import javax.swing.*;

public class SelfPracticing {

	public static void main(String[] args) {
		JButton a = new JButton("A");
		JButton b = new JButton("B");
		JFrame window = new JFrame("ѧϰ����Ĵ���");		//�ײ�����
		window.setBounds(50, 50, 500, 300);
		window.setVisible(true);
		JTabbedPane tabbedPane = new JTabbedPane();		//�м�����
		window.add(tabbedPane);
		JScrollPane scrollPane = new JScrollPane(new JTextArea("����д�ͻ���ֹ�����")); 
		tabbedPane.add("��������", scrollPane);
		JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, true, a, b);
		tabbedPane.add("��ִ���", splitPane);
		
		JFrame window1 = new JFrame("ѧϰ����Ĵ���1");		//�ײ�����
		window1.setBounds(50, 50, 500, 300);
		JTabbedPane tabbedPane1 = new JTabbedPane();		//�м�����
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 50, 50);
		layeredPane.add(new JTextArea(), JLayeredPane.DRAG_LAYER);
		layeredPane.add(new JButton("C"), JLayeredPane.DEFAULT_LAYER);
		tabbedPane1.add("�ֲ㴰��", layeredPane);
		window1.add(tabbedPane1);
		window1.setVisible(true);
		window1.validate();
	}

}
