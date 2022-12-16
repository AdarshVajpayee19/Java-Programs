package com.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class EventOnJCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadioBDemo obj=new RadioBDemo();
	}

}

class RadioBDemo extends JFrame
{
	JTextField t1;
	JButton b;
	JRadioButton r1,r2;
	JLabel l;
	JCheckBox c1,c2;
	public RadioBDemo()
	{
		t1=new JTextField(50);
		b=new JButton("OK");
		r1=new JRadioButton("Male");
		r2=new JRadioButton("Female");
		l=new JLabel("Greeting");
		c1=new JCheckBox("Dancing");
		c2=new JCheckBox("Football");
		
		ButtonGroup bg=new ButtonGroup();//Used to Select one out of many options.In RadioButtons
		bg.add(r1);
		bg.add(r2);
		
		//Sequence Matters depending on the sequence u can see the output.
		add(t1);
		add(r1);
		add(r2);
		add(c1);
		add(c2);
		add(b);
		add(l);
		
		//For Checkbox it is ItemListener.
		//for Buttons it is ActionListener.
		//Listener name is : ItemListener ,Event Name: ItemEvent,Method name :itemStateChanged.
		
		c1.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent e)
			{
				System.out.println("Dancer");
			}
		});
		
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
							if(c1.isSelected())
							{
								name=name+" Dancer";
							}
							if(c2.isSelected())
							{
								name=name+" Footballer";
							}
							l.setText(name);
					}
				});
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}