package com.revature.datastructures;

public class MyBinaryTree {

	private TreeNode root;

	// add a new value to the tree
	public void add(int value) {
		root = addRecursive(root, value);

	}

	private TreeNode addRecursive(TreeNode current, int value) {
		if (current == null) {
			return new TreeNode(value);
		}
		if (value < current.value) {
			current.left = addRecursive(current.left, value);
		} else if (value > current.value) {
			current.right = addRecursive(current.right, value);

		}
		return current; // if value is equal to the value of current node, ignore insertion
	}

	public boolean IsEmpty() {
		return root == null;
	}

	// determine the size of the tree
	public int getSize() {
		return getSizeRec(root);

	}

	// how big is the tree underneath this the including node
	private int getSizeRec(TreeNode current) {
		// ternary (condidion)? [value returned if condition is true]:[value returned if
		// condition is false]
		return current == null ? 0 : getSizeRec(current.left) + 1 + getSizeRec(current.right);

	}

	public boolean containsNode(int value) {
		return containsNodeRec(root, value);
	}

	private boolean containsNodeRec(TreeNode current, int value) {
		if(current == null) {//existence of the node and compares node with chosen value
			return false;
		}
		if(value == current.value) {// check the value
			return true;
		}
		if(value <current.value) {// goes left to find the value
			return containsNodeRec(current.left, value);
		}
		else if (value > current.value) {// goes right to the find the value
			 return containsNodeRec(current.right, value);
		}
		return false;// reaches the end and has not found the value
	
		
	}

	class TreeNode {

		// example of an inner class
		// inner class
		// we never actually need TreeNode outside the binary tree
		// can't make this public

		int value;
		TreeNode left;
		TreeNode right;

		TreeNode(int value) {
			this.value = value;
			right = null;
			left = null;
		}
	}

}
