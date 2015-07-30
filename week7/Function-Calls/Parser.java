package com.hackbulgaria.programming51.week7;

import java.util.Scanner;

public class Parser {

	public static int f1(int x) {
		return 3 * x + 1;
	}

	public static int f2(int x) {
		return 2 * x;
	}

	public static int f3(int x) {
		return x + 1;
	}

	public static int f4(int x) {
		return 6 * x + 2;
	}

	public static int evaluate(String formula, int x) {
		return f1(f2(f3(f4(x))));
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();
		int x = scanner.nextInt();

		System.out.println(evaluate(input, x));

	}
}
