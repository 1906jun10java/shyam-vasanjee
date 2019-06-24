package com.revature.datastructures;

public class MyBinaryTreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBinaryTree tree = new MyBinaryTree();
		System.out.println("Is the tree empty? "+tree.IsEmpty());
		System.out.println("get size of tree: "+tree.getSize());
		tree.add(8);
		tree.add(87);
		tree.add(4);
		tree.add(17);
		tree.add(2);
		System.out.println("after adding some values... ");
		System.out.println("is the tree empty? "+tree.IsEmpty());
		System.out.println("get size of tree: "+tree.getSize());
		System.out.println("Does the tree contain? " +tree.containsNode(17));

	}

}
