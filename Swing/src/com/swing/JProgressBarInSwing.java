package com.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import com.swing.*;
public class JProgressBarInSwing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XY obj=new XY();
	}

}
//In anonymous class by default variables are Final with that class.

class XY extends JFrame implements ActionListener
{
	int i;
	JProgressBar p;
	public XY()
	{
		JButton b=new JButton("ADD FORM");
	    p=new JProgressBar(0,20);//(min,max)constructor.
		i=0;
		Timer t=new Timer(250,this);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				t.start();
			}
		});
		
		add(b);
		add(p);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(i==20)
		{
			new AddSubs();
			dispose();//using dispose we can close the form.
		}
		i++;
		p.setValue(i);
	}
	
}