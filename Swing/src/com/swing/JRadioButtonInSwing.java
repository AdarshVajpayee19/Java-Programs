package com.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class JRadioButtonInSwing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioDemo r=new RadioDemo();
	}
	
}

class RadioDemo extends JFrame
{
	JTextField t1;
	JButton b;
	JRadioButton r1,r2;
	JLabel l;
	public RadioDemo()
	{
		t1=new JTextField(50);
		b=new JButton("OK");
		r1=new JRadioButton("Male");
		r2=new JRadioButton("Female");
		l=new JLabel("Greeting");
		
		
		ButtonGroup bg=new ButtonGroup();//Used to Select one out of many options.In RadioButtons
		bg.add(r1);
		bg.add(r2);
		
		//Sequence Matters depending on the sequence u can see the output.
		add(t1);
		add(r1);
		add(r2);
		add(b);
		add(l);
		
		b.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent ae)
					{
							String name=t1.getText();
							
							if(r1.isSelected())//isSelected will Return a boolean value.
							{
								name="Mr. "+name;
							}
							else
							{
								name="Ms. "+name;
							}
							l.setText(name);
					}
				});
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(600,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}