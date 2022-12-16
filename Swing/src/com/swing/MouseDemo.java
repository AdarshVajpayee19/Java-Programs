package com.swing;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class MouseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XYZ obj = new XYZ();
	}

}

class XYZ extends JFrame {
	public XYZ() {

		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				System.out.println(x + " , " + y);
			}
		});

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}