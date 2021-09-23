package part15_2;

import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CommFrame extends JFrame implements ActionListener {
	File file = null;
	JMenuBar bar;
	JMenu menu;
	JMenuItem inputMenuItem, showMenuItem;
	JTextArea showArea;
	InputMessage inputMessage;
	CardLayout card = null;
	JPanel pCenter;
	CommFrame() {
		file = new File("C:\\Users\\Matty's PC\\Desktop\\Contacts.txt");
		inputMenuItem = new JMenuItem("Save");
		showMenuItem = new JMenuItem("Show");
		bar = new JMenuBar();
		menu = new JMenu("Choose");
		menu.add(inputMenuItem);
		menu.add(showMenuItem);
		bar.add(menu);
		setJMenuBar(bar);
		inputMenuItem.addActionListener(this);
		showMenuItem.addActionListener(this);
		inputMessage = new InputMessage(file);
		showArea = new JTextArea(12, 20);
		card = new CardLayout();
		pCenter = new JPanel();
		pCenter.setLayout(card);
		pCenter.add("InputMenuItem", inputMessage);
		pCenter.add("showMenuItem", showArea);
		add(pCenter, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		setBounds(100, 50, 420, 380);
		validate();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == inputMenuItem) {
			card.show(pCenter, "inputMenuItem");
		}
		else if(e.getSource() == showMenuItem) {
			int number = 1;
			showArea.setText(null);
			card.show(pCenter, "showMenuItem");
			try {
				RandomAccessFile in = new RandomAccessFile(file, "rw");
				String name = null;
				while((name=in.readUTF()) != null) {
					showArea.append("\n" + number + " " + name);
					showArea.append("\t" + in.readUTF());		//email
					showArea.append("\t" + in.readUTF());		//phone
					showArea.append("\n---------------------");
				}
				in.close();
			}
			catch(Exception e2) {}
		}
	}
}
