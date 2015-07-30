package com.hackbulgaria.programming51.week2;

public class AutoShopMain {

	public static void main(String[] args) {
		// Person.java
		Person Ruzha = new Person();
		Ruzha.firstName = "Ruzha";
		Ruzha.lastName = "Bobotanova";
		System.out.println(Ruzha);

		// Auto.java
		Auto audi = new Auto();
		Person personOne = new Person();
		personOne.firstName = "Ivan";
		personOne.lastName = "Georgiev";

		audi.owner = personOne;
		audi.maxSpeed = 200;
		audi.brand = "audi";
		audi.name = "Begachka";
		audi.price = 49999;
		System.out.println(audi);

		// AutoShop.java
		Person ivan = new Person("Ivan", "Petrov");
		Auto audi2 = new Auto(ivan, 250, "Audi", "Begachka", 5000);

		Person gosho = new Person("Gosho", "Gosho");
		Auto peugeot = new Auto();

		peugeot.owner = gosho;
		peugeot.maxSpeed = 220;
		peugeot.brand = "Peugeot";
		peugeot.name = "Dragster";
		peugeot.price = 10000;

		AutoShop as = new AutoShop();

		as.addCar(audi2);
		as.addCar(peugeot);

		System.out.println(as.getTopSpeed());
	}

}
