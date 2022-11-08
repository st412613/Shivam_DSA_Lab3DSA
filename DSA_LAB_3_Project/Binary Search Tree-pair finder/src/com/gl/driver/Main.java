package com.gl.driver;

import com.gl.model.BinarySearchTreePairFinder;
import com.gl.utils.BinarySearchTree;

public class Main {
	public static void main(String[] args) {
		sampleBinaryTree1();//insert binary tree
		pairFinderTest(130);
		pairFinderTest(120);
		pairFinderTest(80);
		pairFinderTest(83);
		pairFinderTest(110);
		pairFinderTest(97);
		pairFinderTest(90);
		pairFinderTest(70);
		pairFinderTest(10);

	}

	public static BinarySearchTree sampleBinaryTree1() {

		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(70);
		tree.insert(50);
		tree.insert(30);
		tree.insert(10);
		tree.insert(60);
		tree.insert(20);
		tree.insert(40);

		tree.print();

		return tree;
	}

	static void pairFinderTest(int sum) {

		BinarySearchTree sampleTree = Main.sampleBinaryTree1();

		Main test = new Main();
		BinarySearchTree sampleTree2 = Main.sampleBinaryTree1();

		BinarySearchTreePairFinder finder = new BinarySearchTreePairFinder(sampleTree2);

		finder.findPair(sum);
		System.out.println("--------------------------------------");
	}
}
