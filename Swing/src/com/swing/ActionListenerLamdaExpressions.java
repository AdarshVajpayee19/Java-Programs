package com.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ActionListenerLamdaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiply obj = new Multiply();
	}
}

class Multiply extends JFrame {
	JTextField t1, t2;
	JButton b;
	JLabel l;

	public Multiply() {
		t1 = new JTextField(50);
		t2 = new JTextField(50);
		b = new JButton("OK");
		l = new JLabel("Multiplyion of Two Number");

		add(t1);
		add(t2);
		add(b);
		add(l);

		// Lambda Expression:Only Works on Functional Interface
		// Functional Interface:Interface with one method Declaration.

		b.addActionListener(ae -> {
			int num1 = Integer.parseInt(t1.getText());
			int num2 = Integer.parseInt(t2.getText());
			int value = num1 * num2;
			l.setText(value + "");
		});

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(600, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
