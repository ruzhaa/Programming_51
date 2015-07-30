package com.hackbulgaria.programming51.week2;

public class CoffeeMachine {
	private Coffee[] brandsOfCoffee;
	private double balance = 0;
	private int machineCapacity = 10;
	private int currentBrands = 0;

	public CoffeeMachine() {
		brandsOfCoffee = new Coffee[machineCapacity];
	}

	private boolean hasBrand(Coffee brands) {
		for (int i = 0; i < currentBrands; i++) {
			if (brandsOfCoffee[i].brand.equals(brands.brand)) {
				return true;
			}
		}

		return false;
	}

	public boolean addCoffee(Coffee coffee) {
		if (currentBrands + 1 >= machineCapacity) {
			return false;
		}
		if (hasBrand(coffee)) {
			return false;
		}
		brandsOfCoffee[currentBrands] = coffee;
		currentBrands++;

		return true;

	}

	public double buyCoffee(Coffee coffee, double userMoney) {
		if (!hasBrand(coffee)) {
			return -1;
		}
		double change = userMoney - coffee.price;
		if (change < 0) {
			return -1;
		}
		balance = balance + coffee.price;

		return change;
	}

	public double getBalance() {
		return balance;
	}

}