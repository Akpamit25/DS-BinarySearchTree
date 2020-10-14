package com.BST;

public class MyBinaryNode<K extends Comparable<K>> implements INode<K> {

	K key;
	MyBinaryNode<K> left;
	MyBinaryNode<K> right;

	public MyBinaryNode(K key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}

	@Override
	public K getKey() {
		return key;//
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}

	@Override
	public INode<K> getLeft() {
		return left;
	}

	@Override
	public void setLeft(INode<K> left) {
		this.left = (MyBinaryNode<K>) left;
	}

	@Override
	public INode<K> getRight() {
		return right;
	}

	@Override
	public void setRight(INode<K> right) {
		this.right = (MyBinaryNode<K>) right;
	}
}
