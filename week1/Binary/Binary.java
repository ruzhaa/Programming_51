package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scanner.nextInt();
		System.out.println(toBinary(n));
		String binary = scanner.next();
		System.out.println(toNumber(binary));
		System.out.println(countBits(n));
		System.out.println(isPowerOfTwo(binary));

	}

	public static String toBinary(int n) {
		String newString = " ";
		int number = n;
		while (number >= 1) {
			int tempNumber = number % 2;
			number = number / 2;
			newString = newString + tempNumber;
		}
		String reversedString = "";
		for (int i = 0; i < newString.length(); i++) {
			reversedString = newString.charAt(i) + reversedString;
		}
		return reversedString;

	}

	public static int toNumber(String binary) {
		String tempBinary = binary;
		int number = 0;
		for (int i = 0; i < tempBinary.length(); i++) {
			char index = tempBinary.charAt(i);
			int temp = 0;
			if (index == '1') {
				temp = (int) Math.pow(2, (tempBinary.length() - (i + 1)));
				number = number + temp;
			}
		}
		return number;
	}

	public static int countBits(int n) {
		int i = 1;
		while (true) {
			if ((n <= Math.pow(2, i) - 1) && (n >= Math.pow(2, i - 1))) {
				return i;
			}
			i++;
		}
	}

	public static boolean isPowerOfTwo(String binary) {
		int counter = 0;
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '1') {
				counter++;
			}
		}
		return counter == 1;
	}
}