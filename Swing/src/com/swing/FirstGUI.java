package com.swing;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FirstGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc obj=new Abc();	
	}
}

//Layouts

//By default JFrame is Invisible to make it visible we have to use .
//JFrame Follows cardlayout.
//Cardlayout : just imagine ur holding a stack of cards u can see only the above Card.
class Abc extends JFrame
{
	public Abc()
	{
//		to apply text we need component
		setLayout(new FlowLayout());//after Adding this we get Hello world Welcome Adarsh at the centre
		JLabel l=new JLabel("Hello Everyone");
		JLabel l1=new JLabel("I am Adarsh Vajpayee");
		
		add(l);
		add(l1);
		
		//Last Component is overriding the old component.here we are using cardlayout so to change layout we have to add setLayout(null);
		setVisible(true);
		setSize(500,600);//to set the size.
	}
}