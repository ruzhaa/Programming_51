package com.hackbulgaria.programming51.week1;

public class PalindromeScore {

	public static void main(String[] args) {
		int a = 48;
		int counter = 1;
		while (true) {
			int num = a;
			int rev = 0;
			while (num > 0) {
				rev = rev * 10;
				rev = rev + num % 10;
				num = num / 10;
			}
			if (a == rev) {
				break;
			}
			a = a + rev;
			counter++;
		}

		System.out.println(counter);
	}
}
