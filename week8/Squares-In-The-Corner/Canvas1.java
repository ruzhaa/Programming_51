package com.hackbulgaria.programming51.week8;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Canvas1 extends JPanel {

	public final int WIDTH = 800;
	public final int HEIGHT = 800;

	public final int SQUARE_WIDTH = 400;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		
		// an example
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D.Double upLeftSquare = new Rectangle2D.Double(0, 0,
				SQUARE_WIDTH, SQUARE_WIDTH);
		g2.setPaint(Color.GREEN);
		g2.fill(upLeftSquare);
		
		Rectangle2D.Double upRightSquare = new
				Rectangle2D.Double(SQUARE_WIDTH, 0, SQUARE_WIDTH, SQUARE_WIDTH);
		g2.setPaint(Color.black);
		g2.fill(upRightSquare);
		
		Rectangle2D.Double downLeftSquare = new Rectangle2D.Double(0,
				SQUARE_WIDTH, SQUARE_WIDTH, HEIGHT);
		g2.setPaint(Color.pink);
		g2.fill(downLeftSquare);
		
		Rectangle2D.Double downRightSquare = new
				Rectangle2D.Double(SQUARE_WIDTH, SQUARE_WIDTH, WIDTH, HEIGHT);
		g2.setPaint(Color.blue);
		g2.fill(downRightSquare);
	}


	public Canvas1() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}
}
