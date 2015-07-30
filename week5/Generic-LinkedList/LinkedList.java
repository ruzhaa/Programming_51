package com.hackbulgaria.programming51.week5;

import java.util.Scanner;

public class LinkedList<T> {
	public Node<T> head;
	public Node<T> tail;

	public LinkedList() {
		head = null;
		tail = null;
	}

	public void addFirst(T data) {
		if (head == null) {
			head = new Node<T>(data);
			tail = head;
		} else {
			Node<T> temp = new Node<T>(data);
			temp.setNext(head);
			head = temp;
		}
	}

	public void addLast(T data) {
		if (head == null) {
			head = new Node<T>(data);
			tail = head;
		} else {
			Node<T> temp = new Node<T>(data);
			tail.setNext(temp);
			tail = temp;
		}
	}

	public T getFirst() {
		return head.getData();
	}

	public T getLast() {
		return tail.getData();
	}

	public T get(int index) {
		return getNode(index).getData();
	}

	public void set(int index, T data) {
		getNode(index).setData(data);
	}

	public Node<T> getNode(int index) {
		Node<T> temp = head;
		int counter = 0;
		while (temp.getNext() != null) {
			if (counter == index) {
				return temp;
			} else {
				temp = temp.getNext();
				counter++;
			}
		}
		return temp;
	}

	public boolean contains(T data) {
		Node<T> temp = head;
		while (temp != null) {
			if (temp.getData().equals(data)) {
				return true;
			}
			temp = temp.getNext();
		}
		return false;
	}

	public int getElementIndex(T data) {
		Node<T> temp = head;
		int counter = 0;
		while (temp != null) {
			if (temp.getData().equals(data)) {
				break;
			}
			temp = temp.getNext();
			counter++;
		}
		return counter;
	}

	public void insertAfter(int index, T data) {
		Node<T> temp = new Node<T>(data);
		Node<T> indexNode = getNode(index);

		temp.setNext(indexNode.getNext());// temp.next = indexNode.next
		indexNode.setNext(temp);// indexNode.next = temp
	}

	public void remove(int index) {
		getNode(index - 1).setNext(getNode(index).getNext());
	}

	public int size() {
		int size = 0;
		Node<T> temp = head;
		while (true) {
			if (temp.getNext() == null) {
				size++;
				return size;
			}
			temp = temp.getNext();
			size++;
		}
	}

	public T[] toArray(T[] arr) {
		Node<T> temp = head;
		int i = 0;
		while (temp != null) {
			arr[i] = temp.getData();
			temp = temp.getNext();
			i++;
		}
		return arr;

	}

	public void addArray(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			addLast(arr[i]);
		}
	}

	public void clear() {
		Node<T> temp = head;
		for (int i = 0; temp != null; i++) {
			remove(i);
		}
		head = null;
		tail = null;
		temp = null;

	}

	public void insertListAfter(int index, LinkedList<T> l) {
		if (l.head != null) {
			for (int i = 0; i < l.size(); i++) {
				insertAfter(index, l.get(i));
				index++;
			}
		}
	}

	public void insertListBefore(int index, LinkedList<T> l) {
		if (l.head != null) {
			for (int i = 0; i < l.size(); i++) {
				if (index == 0) {
					addFirst(l.get(i));
				} else {
					insertAfter(index - 1, l.get(i));
				}
				index++;
			}
		}
	}

	public String toString() {
		String str = "[";
		Node<T> temp = head;
		while (temp.getNext() != null) {
			str += temp.getData() + ", ";
			temp = temp.getNext();
		}
		return str + temp.getData() + "]";

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		Integer[] arr;
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			list1.addLast(scanner.nextInt());
		}
		n = scanner.nextInt();
		arr = new Integer[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		list2.addArray(arr);
		list1.insertListBefore(0, list2);
		list1.insertListAfter(0, list2);

		System.out.println(list1);
	}

}
