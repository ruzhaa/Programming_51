package com.hackbulgaria.programming51.week2;

public class FractionMain {

	public static void main(String[] args) {
		Fraction a = new Fraction(5, 25);
		System.out.println(a);

		Fraction b = new Fraction(4, 12);
		System.out.println(b.getReal());

		Fraction c = new Fraction();
		c.num = 4;
		c.den = 12;
		Fraction d = new Fraction();
		d.num = 5;
		d.den = 24;
		c.sum(d);
		System.out.println(c);

		Fraction e = new Fraction();
		e.num = 4;
		e.den = 12;
		System.out.println(e);
		e.simplify();
		System.out.println(e);

		Fraction temp = new Fraction(2, 5);
		Fraction tempTwo = new Fraction(5, 10);
		temp.sum(tempTwo);
		System.out.println(temp);

	}

}
