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
	TextListener textListener;	//inputText的监视器
	HandleListener handleListener;		////itemCopy, itemCut, itemPaste的监视器
	WindowDocument() {
		init();
		setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	void init() {
		inputText = new JTextArea(15, 20);
		showText = new JTextArea(15, 20);
		showText.setLineWrap(true);			//文本自动换行
		showText.setWrapStyleWord(true);	//文本区以单词为界自动换行
		menuBar = new JMenuBar();
		menu = new JMenu("编辑");
		itemCopy = new JMenuItem("复制(C)");
		itemCut = new JMenuItem("剪切(T)");
		itemPaste = new JMenuItem("粘贴(P)");
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
		inputText.getDocument().addDocumentListener(textListener);		//向文档注册监视器
		itemCopy.addActionListener(handleListener);		//向菜单项注册监视器
		itemCut.addActionListener(handleListener);
		itemPaste.addActionListener(handleListener);
	}
}
