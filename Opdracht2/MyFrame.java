package Opdracht2;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8712581299681837507L;
	private JLabel lab, lab2;

	private JTextField tf;
	private JButton b1, b2;

	public MyFrame() {
		b1 = new JButton("Lees getal in");
		b2 = new JButton("Reset");

		this.setTitle("Opgave 2");
		tf = new JTextField(5);
		lab = new JLabel("Getal tussen 17 en 30");
		lab2 = new JLabel("Voer een getal in en druk op de knop");
		this.setLayout(new FlowLayout());
		this.setBackground(Color.BLACK);
		this.setSize(300, 150);

		this.setVisible(true);
		b1.addActionListener(this);

		this.add(lab);
		this.add(tf);

		this.add(b1);
		this.add(b2);
		this.add(lab2);

	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == b1) {
			
		}
	}

}
