package com.hackbulgaria.programming51.week6;

import java.util.ArrayList;

public class Landscape {

	private ArrayList<Tile> landscape = new ArrayList<>();

	public void addTile(Tile l) {
		landscape.add(l);
	}

	public String renderAll() {
		String result = "";
		for (Tile t : landscape) {
			result += t.render();
		}
		return result;
	}

}
