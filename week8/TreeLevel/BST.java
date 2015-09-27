package com.hackbulgaria.programming51.week8;

public class BST<T extends Comparable<T>> {
	private Node<T> root;

	public BST() {
		root = null;
	}

	public boolean empty() {
		return root == null;
	}

	public void add(T data) {
		if (empty()) {
			root = new Node<T>(data);
		} else {
			if (data.compareTo(root.data) < 0) {
				if (root.left == null) {
					root.left = new Node<T>(data);
				} else {
					addRecursive(data, root.left);
				}
			} else {
				if (root.right == null) {
					root.right = new Node<T>(data);
				} else {
					addRecursive(data, root.right);
				}
			}
		}
	}

	private void addRecursive(T data, Node<T> root) {
		if (data.compareTo(root.data) < 0) { 
			if (root.left == null) {
				root.left = new Node<T>(data);
			} else {
				addRecursive(data, root.left);
			}
		} else {
			if (root.right == null) {
				root.right = new Node<T>(data);
			} else {
				addRecursive(data, root.right); 
			}
		}
	}

	private String toStringRecursive(Node<T> root) {
		if (root == null)
			return "";
		String str = "";
		str += toStringRecursive(root.left);
		str += root.data + " ";
		str += toStringRecursive(root.right);
		return str;
	}

	public String toString() {
		String str = "";
		str += toStringRecursive(root);
		return str;
	}

	public int getTreeHeight() {
		return getTreeHeightRecursive(root);
	}

	private int getTreeHeightRecursive(Node<T> root) {
		if (root == null) {
			return 0;
		} else {
			return 1 + Math.max(getTreeHeightRecursive(root.left),
					getTreeHeightRecursive(root.right));
		}
	}

	public T findSmallest() {
		return findSmallestRecursive(root);
	}

	private T findSmallestRecursive(Node<T> root) {
		if (root.left == null) {
			return root.data;
		} else {
			return findSmallestRecursive(root.left);
		}
	}

	public T findSmallest2() {
		Node<T> current = root;
		while (current.left != null) {
			current = current.left;
		}
		return current.data;
	}

	public void printLevel(int n) {
		printLevelRecursive(n, root);
	}

	private void printLevelRecursive(int level, Node<T> root) {
		if (root == null) {
			return;
		}
		if (level == 1) {
			// if (level == 0) {
			System.out.print(root.data + " ");
		} else {
			printLevelRecursive(level - 1, root.left);
			printLevelRecursive(level - 1, root.right);
		}
	}
}
