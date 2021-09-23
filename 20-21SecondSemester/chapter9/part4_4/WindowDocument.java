package part4_4;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

public class WindowDocument extends JFrame {
	JTextArea inputText, showText;
	JMenuBar menuBar;
	JMenu menu;
	JMenuItem itemCopy, itemCut, itemPaste;
	TextListener textListener;	//inputText�ļ�����
	HandleListener handleListener;		////itemCopy, itemCut, itemPaste�ļ�����
	WindowDocument() {
		init();
		setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	void init() {
		inputText = new JTextArea(15, 20);
		showText = new JTextArea(15, 20);
		showText.setLineWrap(true);			//�ı��Զ�����
		showText.setWrapStyleWord(true);	//�ı����Ե���Ϊ���Զ�����
		menuBar = new JMenuBar();
		menu = new JMenu("�༭");
		itemCopy = new JMenuItem("����(C)");
		itemCut = new JMenuItem("����(T)");
		itemPaste = new JMenuItem("ճ��(P)");
		itemCopy.setAccelerator(KeyStroke.getKeyStroke('c'));
		itemCut.setAccelerator(KeyStroke.getKeyStroke('x'));
		itemPaste.setAccelerator(KeyStroke.getKeyStroke('v'));
		itemCopy.setActionCommand("Copy");
		itemCut.setActionCommand("Cut");
		itemPaste.setActionCommand("Paste");
		menu.add(itemCopy);
		menu.add(itemCut);
		menu.add(itemPaste);
		menuBar.add(menu);
		setJMenuBar(menuBar);
		add(new JScrollPane(inputText));
		add(new JScrollPane(showText));
		textListener = new TextListener();
		handleListener = new HandleListener();
		textListener.setInputText(inputText);
		textListener.setShowText(showText);
		handleListener.setInputText(inputText);
		handleListener.setShowText(showText);
		inputText.getDocument().addDocumentListener(textListener);		//���ĵ�ע�������
		itemCopy.addActionListener(handleListener);		//��˵���ע�������
		itemCut.addActionListener(handleListener);
		itemPaste.addActionListener(handleListener);
	}
}
