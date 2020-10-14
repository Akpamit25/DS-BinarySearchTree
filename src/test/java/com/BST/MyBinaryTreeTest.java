package com.BST;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyBinaryTreeTest {

	@Test
	void given3Numbers_WhenAdded_ShouldFormABinaryTree() {
		MyBinaryTree<Integer> myTree = new MyBinaryTree<Integer>();
		myTree.add(56);
		myTree.add(30);
		myTree.add(70);

		boolean result = myTree.root.getKey().equals(56) && myTree.root.getLeft().getKey().equals(30)
				&& myTree.root.getRight().getKey().equals(70);

		assertTrue(result);
	}

	@Test
	void givenNumbers_WhenAdded_ShouldFormATree_SizeTest() {
		MyBinaryTree<Integer> myTree = new MyBinaryTree<Integer>();
		myTree.add(56);
		myTree.add(30);
		myTree.add(40);
		myTree.add(70);
		myTree.add(22);
		myTree.add(95);
		myTree.add(60);
		myTree.add(11);
		myTree.add(65);
		myTree.add(16);
		myTree.add(67);
		myTree.add(63);
		myTree.add(3);
		int size = myTree.size();
		assertEquals(13, size);

	}

	@Test
	void givenATree_WhenSearchedForElement_IfPresent_ShouldReturnTrue() {
		MyBinaryTree<Integer> myTree = new MyBinaryTree<Integer>();
		myTree.add(56);
		myTree.add(30);
		myTree.add(70);
		myTree.add(40);
		myTree.add(22);
		myTree.add(95);
		myTree.add(60);
		myTree.add(11);
		myTree.add(65);
		myTree.add(16);
		myTree.add(67);
		myTree.add(63);
		myTree.add(3);
		boolean result = myTree.search(63);
		assertTrue(result);
	}

}