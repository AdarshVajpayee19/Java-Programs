package com.swing;

import java.awt.FlowLayout;//AWT : Abstract Window ToolKit
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AdditionOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition obj=new Addition();
	}
}

//whenever you create an object of class it also create object of super class and its super Interface.

class Addition extends JFrame implements ActionListener 
{
	//To increase Scope we use this here.
	JTextField t1,t2;
	JButton b;
	JLabel l;
	public Addition()
	{
	    t1=new JTextField(20);	
		t2=new JTextField(20);	
	    b=new JButton("OK");
		l =new JLabel("Result");
		
		add(t1);
		add(t2);
		add(b);
		add(l);
		
		//we have to add an listener to button.we need to add addActionListener to the button.
		b.addActionListener(this);//Action listener is an interface,how to create an object of interface otherwise we need to use our class which will implement actionlistener.
		
		//the above  code needs object of ActionListener 
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(300,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	//we need implement the method which is present in interface of Action listener named "actionPerformed".
	public void actionPerformed(ActionEvent ae)
	{
			int num1=Integer.parseInt(t1.getText());
			int num2=Integer.parseInt(t2.getText());
			
			int value=num1+num2;
			//now we need to set the label.
			l.setText(value+"");//here value is an integer but .setText wants String we can int to string using value+" which is equals to String.
			
	}
}
