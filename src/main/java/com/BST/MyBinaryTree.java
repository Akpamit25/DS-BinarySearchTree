package com.BST;

public class MyBinaryTree<K extends Comparable<K>> {
	MyBinaryNode<K> root;

	public void add(K key) {
		if (root == null) {
			this.root = new MyBinaryNode<K>(key);
		} else {
			addKeyAtAppropriateNode(root, key);
		}
	}


	private void addKeyAtAppropriateNode(MyBinaryNode<K> pointer, K key) {
		if (pointer.key.compareTo(key) == 1) {
			if (pointer.left == null) {
				pointer.left = new MyBinaryNode(key);
			} else {
				addKeyAtAppropriateNode(pointer.left, key);
			}
		}
		if (pointer.key.compareTo(key) == -1) {
			if (pointer.right == null) {
				pointer.right = new MyBinaryNode(key);
			} else {
				addKeyAtAppropriateNode(pointer.right, key);
			}
		}
	}


	public boolean search(K key) {
		return searchMyTree(root, key);
	}

	private boolean searchMyTree(MyBinaryNode<K> pointer, K key) {
		boolean result = false;
		if (pointer != null) {
			int compareResult = pointer.key.compareTo(key);
			if (compareResult == 1) {
				if (pointer.left != null) {
					if (pointer.left.getKey() == key) {
						result = true;
					} else {
						result = searchMyTree(pointer.left, key);
					}
				}
			}
			if (compareResult == -1) {
				if (pointer.right != null) {
					if (pointer.right.key == key) {
						result = true;
					} else {
						result = searchMyTree(pointer.right, key);
					}
				}
			}
			if (compareResult == 0)
				result = true;
		}
		return result;
	}


	public int size() {
		return myTreeSize(root);
	}


	private int myTreeSize(MyBinaryNode<K> pointer) {
		return (pointer == null) ? 0 : 1 + myTreeSize(pointer.left) + myTreeSize(pointer.right);
	}
}