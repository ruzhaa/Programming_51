package com.hackbulgaria.programming51.week6;

import java.util.Scanner;
import java.util.Vector;

public class TheGameMain {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int health = scanner.nextInt();
		String weaponName = scanner.next();

		Weapon weapon;
		switch (weaponName) {
		case "axe": {
			weapon = new Axe();
			break;
		}
		case "shotgun": {
			weapon = new Shotgun();
			break;
		}
		case "revolver": {
			weapon = new Revolver();
			break;
		}
		case "sword": {
			weapon = new AncientSword();
			break;
		}
		default: {
			System.out.println("akjfa");
			return;
		}
		}

		Vector<Zombie> zombies = new Vector<>();

		for (int i = 0; i < n; i++) {
			zombies.add(new CreateZombie(health));

			int counter = 0;
			for (int j = 0; j < zombies.size(); j++) {
				Zombie currentZombie = zombies.get(j);
				while (!currentZombie.isDead()) { // dokato ne e murtvo
					currentZombie.hit(weapon.hit());
					counter++;
				}
			}
			System.out.println(counter);
		}
	}
}
