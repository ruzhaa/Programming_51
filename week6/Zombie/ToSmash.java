package com.hackbulgaria.programming51.week6;

public class ToSmash extends Weapon {

	public ToSmash(int damage, int durability) {
		super(damage, durability, "TO_SMASH");
	}

	public int hit() {
		int temp = damage;
		if (currentDurability <= durability / 2 && damage > 1) {
			damage--;
		}
		if (currentDurability > 0) {
			currentDurability--;
		}
		return damage;		
	}

	@Override
	public String getType() {
		return null;
	}
}
