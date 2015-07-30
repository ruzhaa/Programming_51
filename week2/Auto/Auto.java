package com.hackbulgaria.programming51.week2;

public class Auto {
	public Person owner = new Person();
	public float maxSpeed = 0;
	public String brand = "";
	public String name = "";
	public double price = 0;

	public Auto() {

	}

	public Auto(Person owner, float maxSpeed, String brand, String name,
			double price) {
		this.owner = owner;
		this.maxSpeed = maxSpeed;
		this.brand = brand;
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return brand + " " + name + ", MaxSpeed: " + maxSpeed + ", Price: "
				+ price + ", Owner: " + owner;
	}

}
