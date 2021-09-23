package part3;

import java.awt.*;
import javax.swing.*;

public class ShowLayout extends JFrame {
	PanelGridLayout panelGrid;		//网格布局的面板
	PanelNullLayout panelNull;		//空布局的面板
	JTabbedPane tabbedPane;
	ShowLayout() {
		panelGrid = new PanelGridLayout();			//容器
		panelNull = new PanelNullLayout();			//容器
		tabbedPane = new JTabbedPane();				//容器（以上两个容器是它的组件）
		tabbedPane.add("网格布局的面板", panelGrid);
		tabbedPane.add("空布局的面板", panelNull);
		add(tabbedPane, BorderLayout.CENTER);
		add(new JButton("窗口是Layout布局"), BorderLayout.NORTH);		//纯组件
		add(new JButton("SOUTH"), BorderLayout.SOUTH);
		add(new JButton("WEST"), BorderLayout.WEST);
		add(new JButton("EAST"), BorderLayout.EAST);
		setBounds(10,10,500,400);
		setTitle("学习布局：控制组件在容器中的位置");
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		validate();
		
		Panel panelCard = new Panel();
		CardLayout card = new CardLayout();
		panelCard.setLayout(card);
		panelCard.add("a", new JButton("A"));
		panelCard.add("b", new JButton("B"));
		tabbedPane.add("卡片布局的面板", panelCard);
		//add(panelCard, BorderLayout.SOUTH);
		card.show(panelCard, "b");
	}
}
