package part5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//MVC结构里的View
public class WindowTriangle extends JFrame implements ActionListener {
	Triangle triangle;					//Model
	JTextField textA, textB, textC;		//View
	JTextArea showArea;					//View
	JButton controlButton;				//Controller
	WindowTriangle() {
		init();
		setVisible(true);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	void init() {
		triangle = new Triangle();
		textA = new JTextField(5);
		textB = new JTextField(5);
		textC  = new JTextField(5);
		showArea = new JTextArea();
		controlButton = new JButton("计算面积");
		JPanel panelNorth = new JPanel();		//JPanel面板的默认布局是FlowLayout布局
		panelNorth.add(new JLabel("边A:"));
		panelNorth.add(textA);
		panelNorth.add(new JLabel("边B:"));
		panelNorth.add(textB);
		panelNorth.add(new JLabel("边C:"));
		panelNorth.add(textC);
		panelNorth.add(controlButton);
		controlButton.addActionListener(this);
		add(panelNorth, BorderLayout.NORTH);
		add(new JScrollPane(showArea), BorderLayout.CENTER);
	}
	public void actionPerformed(ActionEvent e) {
		try
		{
			double a = Double.parseDouble(textA.getText().trim());
			double b = Double.parseDouble(textB.getText().trim());
			double c = Double.parseDouble(textC.getText().trim());
			triangle.setSideA(a);
			triangle.setSideB(b);
			triangle.setSideC(c);
			String area = triangle.getArea();
			showArea.append("三角形" + a + "," + b + "," + c + "的面积: ");
			showArea.append(area + "\n");
		}
		catch(Exception exception)
		{
			showArea.append("Exception catched! \n");
		}
	}
}
