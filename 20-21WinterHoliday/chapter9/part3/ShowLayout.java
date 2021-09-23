package part3;

import java.awt.*;
import javax.swing.*;

public class ShowLayout extends JFrame {
	PanelGridLayout panelGrid;		//���񲼾ֵ����
	PanelNullLayout panelNull;		//�ղ��ֵ����
	JTabbedPane tabbedPane;
	ShowLayout() {
		panelGrid = new PanelGridLayout();			//����
		panelNull = new PanelNullLayout();			//����
		tabbedPane = new JTabbedPane();				//�����������������������������
		tabbedPane.add("���񲼾ֵ����", panelGrid);
		tabbedPane.add("�ղ��ֵ����", panelNull);
		add(tabbedPane, BorderLayout.CENTER);
		add(new JButton("������Layout����"), BorderLayout.NORTH);		//�����
		add(new JButton("SOUTH"), BorderLayout.SOUTH);
		add(new JButton("WEST"), BorderLayout.WEST);
		add(new JButton("EAST"), BorderLayout.EAST);
		setBounds(10,10,500,400);
		setTitle("ѧϰ���֣���������������е�λ��");
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		validate();
		
		Panel panelCard = new Panel();
		CardLayout card = new CardLayout();
		panelCard.setLayout(card);
		panelCard.add("a", new JButton("A"));
		panelCard.add("b", new JButton("B"));
		tabbedPane.add("��Ƭ���ֵ����", panelCard);
		//add(panelCard, BorderLayout.SOUTH);
		card.show(panelCard, "b");
	}
}
