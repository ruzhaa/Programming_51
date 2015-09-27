package com.hackbulgaria.programming51.week6;

public abstract class Weapon {
	protected int damage;
	protected int durability;
	protected int currentDurability;
	protected String type = " ";

	public Weapon() {

	}

	public Weapon(int damage, int durability, String type) {
		this.damage = damage;
		this.durability = durability;
		this.currentDurability = durability;
		this.type = type;
	}

	public int getDamage() {
		return damage;
	}

	public int getDurability() {
		return currentDurability;
	}

	public abstract String getType();

	public abstract int hit();
	

}
