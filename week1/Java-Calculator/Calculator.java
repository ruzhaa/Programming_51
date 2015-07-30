package com.hackbulgaria.programming51.week1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		char oper = scanner.next().charAt(0);
		int b = scanner.nextInt();

		if (oper == '+') {
			System.out.println(a + "+" + b + "=" + (a + b));
		}
		if (oper == '-') {
			System.out.println(a + "-" + b + "=" + (a - b));
		}
		if (oper == '*') {
			System.out.println(a + "*" + b + "=" + (a * b));
		}
		if (oper == '/') {
			System.out.println(a + "/" + b + "=" + (a / b));
		}
		if (oper == '^') {
			int temp = 1;
			for (int i = 0; i < b; i++) {
				temp = temp * a;
			}
			System.out.println(a + " ^ " + b + " = " + temp);
		}
		if (oper == '?') {
			int facA = 1;
			for (int i = 1; i <= a; i++) {
				facA *= i;
			}
			int facB = 1;
			for (int i = 1; i <= b; i++) {
				facB *= i;
			}
			System.out.println(a + "?" + b + "=" + (facA + facB));
		}

	}
}
