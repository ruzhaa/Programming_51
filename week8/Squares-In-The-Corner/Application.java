package com.hackbulgaria.programming51.week8;

import javax.swing.JFrame;

public class Application extends JFrame {
	public Application() {
		// Canvas1.java
		super.add(new Canvas1());
		setResizable(false);
		pack();
		setTitle("My application name");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		Application app = new Application();
		app.setVisible(true);
	}
}
