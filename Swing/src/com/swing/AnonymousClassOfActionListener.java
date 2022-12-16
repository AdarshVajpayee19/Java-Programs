package com.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AnonymousClassOfActionListener {
	public static void main(String args[])
	{
		Substract obj=new Substract();
	}
}

class Substract extends JFrame
{
	JTextField t1,t2;
	JButton b;
	JLabel l;
	public Substract()
	{
		t1=new JTextField(50);
		t2=new JTextField(50);
		b=new JButton("OK");
		l=new JLabel("Substraction of Two Number");
		
		add(t1);
		add(t2);
		add(b);
		add(l);
		
		//since ActionListener is an interface we cannot create an object of it. so creating an anonymous objects.
		//One Way:
		/*
		ActionListener al=new ActionListener()
				{
					public void actionPerformed(ActionEvent ae)
					{
						int num1=Integer.parseInt(t1.getText());
						int num2=Integer.parseInt(t2.getText());	
						int value=num1-num2;
						l.setText(value+"");
					}
				};	
		b.addActionListener(al);
		*/
		
		//Second Way:
		b.addActionListener(new ActionListener()
				{
			          public void actionPerformed(ActionEvent ae)
			          {
			          	int num1=Integer.parseInt(t1.getText());
			          	int num2=Integer.parseInt(t2.getText());	
			          	int value=num1-num2;
			          	l.setText(value+"");
			          }
				});
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(600,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
