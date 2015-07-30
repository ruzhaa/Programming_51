package com.hackbulgaria.programming51.week7;

import java.util.Collections;
import java.util.Vector;

public class PositivesAndNegatives {

	private int[] number;

	public PositivesAndNegatives(int[] n) {
		number = n;
	}

	public static Stack<Integer> reorder(int[] numbers) {
		Stack<Integer> result = new Stack<Integer>();
		Vector<Integer> positives = new Vector<>();
		Vector<Integer> negatives = new Vector<>();
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				negatives.add(numbers[i]);
			} else {
				positives.add(numbers[i]);
			}
		}
		Collections.sort(positives);
		Collections.sort(negatives, Collections.reverseOrder());
		for (int i = 0; i < positives.size(); i++) {
			result.push(positives.get(i));
		}
		for (int i = 0; i < negatives.size(); i++) {
			result.push(negatives.get(i));
		}

		return result;
	}

	public static void main(String[] args) {

		int[] n = { 1, 2, 3, -10, -5, 8, -100 };
		Stack<Integer> result = reorder(n);

		while (!result.empty()) {
			System.out.println(result.pop());
		}
	}
}
