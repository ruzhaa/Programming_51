package com.hackbulgaria.programming51.week8;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class CanvasCB extends JPanel {

	public final int WIDTH = 800;
	public final int HEIGHT = 800;

	public final int SQUARE_WIDTH = 40;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		int counter = 0;
		for (int i = 0; i < WIDTH; i += 40) {
			for (int j = 0; j < WIDTH; j += 40) {
				Graphics2D g2 = (Graphics2D) g;
				if (counter % 2 == 0) {
					Rectangle2D.Double blackSquare = new Rectangle2D.Double(j,
							i, SQUARE_WIDTH, SQUARE_WIDTH);
					g2.setPaint(Color.BLACK);
					g2.fill(blackSquare);
				} else {
					Rectangle2D.Double blackSquare = new Rectangle2D.Double(j,
							i, SQUARE_WIDTH, SQUARE_WIDTH);
					g2.setPaint(Color.white);
					g2.fill(blackSquare);
				}
				counter++;
			}
			counter++;
		}
	}

	public CanvasCB() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
	}
}
