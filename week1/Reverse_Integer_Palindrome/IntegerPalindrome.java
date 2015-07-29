package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int number = n;
		int reverse = 0;

		while (number > 0) {
			reverse = (reverse * 10) + number % 10;
			number = number / 10;
		}

		int sum = n + reverse;
		int revSum = 0;
		while (sum > 0) {
			revSum = (revSum * 10) + sum % 10;
			sum = sum / 10;
		}

		if (revSum == n + reverse) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
