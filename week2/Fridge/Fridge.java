package com.hackbulgaria.programming51.week2;

public class Fridge {
	private int capacity = 100;
	public Food[] foods = new Food[capacity];
	private int weightFridge;
	private int currentCapacity;
	private int currentIndex;

	public Fridge(int currentCapacity) {
		this.currentCapacity = currentCapacity;
	}

	public Fridge(int currentCapacity, int weightCapacity) {
		this.currentCapacity = currentCapacity;
		this.weightFridge = weightCapacity;
	}

	public boolean addFood(Food f) {
		if (currentIndex <= currentCapacity) {
			foods[currentIndex] = f;
			currentIndex++;
			weightFridge -= f.weight;
			return true;
		}
		return false;
	}

	public int getFoodsCount() {
		return currentCapacity;
	}

	public String toString() {
		for (int i = 0; i < currentCapacity; i++) {
			System.out.println(foods[i]);
		}
		return "";

	}

	public String[] getProductsOfType(String type) {
		String[] productsOfType = new String[currentIndex];
		for (int i = 0; i < currentIndex; i++) {
			for (int j = 0; j < currentIndex; j++) {
				if (foods[i].type.equals(type)) {
					productsOfType[j] = foods[i].name;
				}
			}
		}
		return productsOfType;
	}

	public int getWeight() {
		int temp = 0;
		for (int i = 0; i < currentIndex; i++) {
			temp += foods[i].weight;
		}
		return temp;
	}

	public int getMaxWeight() {
		return weightFridge;
	}

	public Food getHeaviestFood() {
		int maxWeight = 0;
		Food f = foods[0];
		for (int i = 0; i < currentIndex - 1; i++) {
			maxWeight = foods[i].weight;
			if (maxWeight < foods[i + 1].weight) {
				maxWeight = foods[i + 1].weight;
				f = foods[i + 1];
			}
		}
		return f;
	}

	public int getCapacity() {
		return capacity;
	}
}