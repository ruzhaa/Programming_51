package com.hackbulgaria.programming51.week6;

public class ToShoot extends Weapon {

	public ToShoot(int damage, int durability) {
		super(damage, durability, "TO_SHOOT");
	}

	public int hit() {
		int temp = damage;
		if (currentDurability > 0) {
			currentDurability--;
		} else {
			damage = 1;
		}
		return damage;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}
}
