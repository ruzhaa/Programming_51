package com.hackbulgaria.programming51.week2;

public class Fraction {
	public int num = 0;
	public int den = 1;

	public Fraction() {

	}

	public Fraction(int n, int d) {
		num = n;
		den = d;
	}

	public String toString() {
		int thisGcd = gcd(num, den);

		return (num / thisGcd + "/" + den / thisGcd);
	}

	private int gcd(int den1, int den2) {
		int factor = den2;
		while (den2 != 0) {
			factor = den2;
			den2 = den1 % den2;
			den1 = factor;
		}
		return den1;

	}

	public double getReal() {
		return (double) num / den;
	}

	public void sum(Fraction F) {
		this.num = this.num * F.den + F.num * this.den;
		this.den = this.den * F.den;

	}

	public void simplify() {
		int temp = gcd(this.num, this.den);
		this.num = num / temp;
		this.den = den / temp;
	}

}