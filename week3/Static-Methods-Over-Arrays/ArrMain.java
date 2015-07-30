package com.hackbulgaria.programming51.week3;

public class ArrMain {

	public static void main(String[] args) {

		int[] a = { 3, 1, -40, 200, 5 };
		a = Arr.reverse(a);
		System.out.println(Arr.toString(a));
		System.out.println(Arr.join(a, ": "));
		System.out.println(Arr.join(a, "->"));
		int b = Arr.sum(a);
		System.out.println(b);
		System.out.println(Arr.join(a, ", "));

		int[] c = { 2, 3, 4, 8, 9, 11, 13, 15 };
		int[] temp = Arr.filterOdd(c);
		System.out.println(Arr.join(temp, ", "));
	}

}
