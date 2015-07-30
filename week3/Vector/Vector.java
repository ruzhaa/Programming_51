package com.hackbulgaria.programming51.week3;

public class Vector<T> {
	private T[] data;
	private int size = 0;
	private int capacity = 10;

	public Vector() {
		data = (T[]) new Object[capacity];
	}

	public T get(int index) {
		return data[index];
	}

	public void set(int index, T el) {
		data[index] = el;
	}

	public int size() {
		return size;
	}

	public void add(T el) {
		if (size == capacity) {
			resize();
		}
		data[size] = el;
		size++;
	}

	public void insert(int index, T el) {
		if (size == capacity) {
			resize();
		}
		for (int j = size; j >= index; j--) {
			data[j] = data[j - 1];
		}
		data[index] = el;
		size++;

	}

	public void remove(int index) {
		for (int j = index; j < size - 1; j++) {
			data[j] = data[j + 1];
		}
		size--;

	}

	public boolean contains(T el) {
		for (int i = 0; i < size; i++) {
			if (data[i].equals(el)) {
				return true;
			}
		}
		return false;
	}

	public String toString() {
		String temp = "";
		for (int i = 0; i < size; i++) {
			temp += data[i] + "\n";
		}
		return temp;
	}

	private void resize() {
		capacity = capacity * 2 + 1;
		T[] temp = (T[]) new Object[capacity];
		for (int i = 0; i < size; i++) {
			temp[i] = data[i];
		}
		data = temp;
	}

	public static void main(String[] args) {

	}

}
