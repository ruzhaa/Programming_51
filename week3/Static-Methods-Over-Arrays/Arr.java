package com.hackbulgaria.programming51.week3;

public class Arr {
	public static String toString(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (i == a.length - 1) {
				System.out.print(a[i] + "");
			} else {
				System.out.print(a[i] + ", ");
			}
		}
		return "";
	}

	public static void sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] > a[j]) // swap items
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static int[] reverse(int[] a) {
		int index = 0;
		for (int i = a.length - 1; i > (a.length) / 2; --i) {
			int temp = a[i];
			a[i] = a[index];
			a[index] = temp;
			index++;
		}
		return a;
	}

	public static String join(int[] a, String glue) {
		for (int i = 0; i < a.length; i++) {
			if (i == a.length - 1) {
				System.out.print(a[i] + "");
			} else {
				System.out.print(a[i] + glue);
			}
		}
		return "";
	}

	public static int sum(int[] a) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}

	public static int[] range(int a, int b) {
		int[] result = new int[b - a];
		int index = 0;
		for (int i = a; i < b; i++) {
			result[index] = i;
			index++;
		}
		return result;
	}

	public static int[] filterOdd(int[] a) {
		int[] result = new int[a.length];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				result[index] = a[i];
				index++;
			}
		}
		int[] newArr = new int[index];
		for (int i = 0; i < index; i++) {
			newArr[i] = result[i];
		}
		return newArr;
	}
}