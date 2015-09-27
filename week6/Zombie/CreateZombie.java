package com.hackbulgaria.programming51.week6;

public class CreateZombie implements Zombie {
	private int health = 100;
	private int currentHealth = 0;

	public CreateZombie(int zombieHealth) {
		health = zombieHealth;
		currentHealth = zombieHealth;
	}

	public int getTotalHealth() {
		return health;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public void hit(int damage) {
		currentHealth -= damage;
		if (currentHealth <= 0) {
			currentHealth = 0;
		}
	}

	public boolean isDead() {
		return currentHealth == 0;
	}

}
