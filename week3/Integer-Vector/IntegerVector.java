package com.hackbulgaria.programming51.week3;

public class IntegerVector {
	private int[] data;
	private int capacity;
	private int size;

	public IntegerVector() {
		capacity = 10;
		data = new int[capacity];
		size = 0;
	}

	public int get(int index) {
		return data[index];
	}

	public int size() {
		return size;
	}

	public void set(int index, int value) {
		data[index] = value;
	}

	private void resize() {
		capacity = capacity * 2 + 1;
		int[] temp = new int[capacity];
		for (int i = 0; i < size; i++) {
			temp[i] = data[i];
		}
		data = temp;
	}

	public void add(int elem) {
		if (size == capacity) {
			resize();
		}
		data[size] = elem;
		size++;

	}

	public void addAll(int[] n) {
		for (int i = 0; i < n.length; i++) {
			add(n[i]);
		}

	}

	public int sum() {
		int result = 0;
		for (int i = 0; i < size; i++) {
			result += data[i];
		}
		return result;
	}

	public String toString() {
		String temp = "";
		for (int i = 0; i < size; i++) {
			temp += data[i] + " ";
		}
		return temp;
	}

	public void insert(int index, int value) {
		if (size == capacity) {
			resize();
		}

		int[] temp = new int[size + 1];
		for (int i = 0; i < index; i++) {
			temp[i] = data[i];
		}
		temp[index] = value;
		for (int j = index; j < size; j++) {
			temp[j + 1] = data[j];
		}
		size++;
		data = temp;

	}

	public void remove(int index) {
		for (int j = index; j < size - 1; j++) {
			data[j] = data[j + 1];
		}
		size--;

	}
}
