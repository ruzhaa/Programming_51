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
	
	public static void main(String[] args) {
		// Coffee.java
		Coffee Java = new Coffee("Java", 1.00);
		System.out.println(Java);
		Java.toString();

		// CoffeeMachine.java
		CoffeeMachine cm = new CoffeeMachine();

		Coffee java = new Coffee();
		Coffee latte = new Coffee();

		java.brand = "Java";
		java.price = 1.00;

		latte.brand = "Latte";
		latte.price = 1.50;

		cm.addCoffee(java);
		cm.addCoffee(latte);

		System.out.println(cm.buyCoffee(latte, 3.40));
		System.out.println("Current balance: " + cm.getBalance());
	}


}
