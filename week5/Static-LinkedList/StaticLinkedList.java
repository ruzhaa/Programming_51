package com.hackbulgaria.programming51.week5;

import java.util.Scanner;

public class StaticLinkedList {

	public static LinkedList<Integer> reverse(LinkedList<Integer> l) {
		Node<Integer> temp = l.head;
		LinkedList<Integer> reverseList = new LinkedList<Integer>();
		while (temp != null) {
			reverseList.addFirst(temp.getData());
			temp = temp.getNext();
		}

		return reverseList;
	}

	public static void sort(LinkedList<Integer> l) {
		for (int i = 0; i < l.size(); i++) {
			for (int j = i; j < l.size(); j++) {
				if (l.get(i) < l.get(j)) {
					int temp = l.get(i);
					l.set(i, l.get(j));
					l.set(j, temp);
				}
			}
		}
	}

	public static LinkedList<Integer> merge(LinkedList<Integer> a,
			LinkedList<Integer> b) {
		LinkedList<Integer> result = new LinkedList<>();
		for (int i = 0; i < a.size(); i++) {
			result.addLast(a.get(i));
		}
		for (int i = 0; i < b.size(); i++) {
			result.addLast(b.get(i));
		}

		StaticLinkedList.sort(result);
		return result;
	}

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<>();
		LinkedList<Integer> secondL = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			l.addLast(scanner.nextInt());
		}
		n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			secondL.addLast(scanner.nextInt());
		}

		System.out.println(StaticLinkedList.reverse(l));
		StaticLinkedList.sort(l);
		System.out.println(l);
		System.out.println(StaticLinkedList.merge(l, secondL));
	}

}
