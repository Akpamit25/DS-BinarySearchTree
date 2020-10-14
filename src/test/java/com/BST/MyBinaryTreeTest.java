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
		
		boolean result = myTree.root.getKey().equals(56)
						&& myTree.root.getLeft().getKey().equals(30)
						&& myTree.root.getRight().getKey().equals(70);
						
		assertTrue(result);//
	}

}