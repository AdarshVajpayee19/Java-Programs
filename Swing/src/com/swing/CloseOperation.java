package com.swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CloseOperation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abcd obj=new Abcd();	
	}
}

//We have Manually Close the Window that gets popped up.
class Abcd extends JFrame
{
	public Abcd()
	{
		JLabel l=new JLabel("Hello World");
		JLabel l1=new JLabel("Welcome Adarsh");
		
		add(l);
		add(l1);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(500, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
