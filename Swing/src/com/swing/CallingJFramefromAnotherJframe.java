package com.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import com.swing.Addition;

public class CallingJFramefromAnotherJframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X obj=new X();
	}

}

class X extends JFrame
{
	public X()
	{
		JButton b=new JButton("ADD FORM");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				new Addition();
				dispose();//using dispose we can close the form.
			}
		});
		
		add(b);
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(600,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}