package com.revature.datastructures;

public class Node<T> {
	/*
	 * This class will represent an element in our LinkedList implementation T is
	 * the generic placeholder for the data-type of the object contained in each
	 * element.
	 */
	private Node<T> nextNode; // reference to next element of the List
	private T data; //actual object held in the current element

	public Node(Node<T> nextNode, T data) {// call a parameterized constructor
		super();
		this.nextNode = nextNode;
		this.data = data;
	}

	public Node<T> getNextNode() {//Node functions point to next node (pointer)
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode) {//set s current node to point
		this.nextNode = nextNode;
	}

	public T getData() {// information about the stored object
		return data;
	}

	public void setData(T data) {// Mutate the information inside the object
		this.data = data;
	}

}
