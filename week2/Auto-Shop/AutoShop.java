package com.hackbulgaria.programming51.week2;

public class AutoShop {
	public Auto[] cars = new Auto[10];
	public int temp = 0;

	public void addCar(Auto car) {
		cars[temp] = car;
		temp++;

	}

	public Auto getTopSpeed() {
		Auto tempCar = cars[0];
		for (int i = 0; i < temp; i++) {
			if (tempCar.maxSpeed > cars[i].maxSpeed) {
				cars[i] = tempCar;
			}
		}
		return tempCar;
	}

}
