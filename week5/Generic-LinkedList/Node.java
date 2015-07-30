package com.hackbulgaria.programming51.week5;

public class Node<T> {
	private T data;
	private Node<T> next;

	public Node(T data) {
		setData(data);
		setNext(null);
	}

	public T getData() {
		return data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
}
