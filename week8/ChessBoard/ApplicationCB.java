package com.hackbulgaria.programming51.week8;

import javax.swing.JFrame;

public class ApplicationCB extends JFrame {
	public ApplicationCB() {
		super.add(new CanvasCB());
		setResizable(false);
		pack();
		setTitle("My application name");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		ApplicationCB app = new ApplicationCB();
		app.setVisible(true);
	}
}
