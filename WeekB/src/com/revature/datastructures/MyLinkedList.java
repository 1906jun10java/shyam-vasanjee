package com.revature.datastructures;

public class MyLinkedList<T> {

	public MyLinkedList() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// root node of the list."the head"
	private Node<T> head;
	
	// end node of the list, the tail
	private Node<T> tail;
	
	// insert a node at the end of the list 
	public void insert(T data) {
		//create new Node object for the data
		//generic only need to be instantiated once
		Node<T> newNode = new Node<>(null, data);// at the end of the list
		//if the head is null, this new node will become the head
		if(this.head == null) {
			System.out.println("List is empty, adding first element");
			this.head = newNode;// the node will be a head and tail since there are no other nodes
			this.tail = newNode;// point to the same object
			// otherwise, we add this as the tail
		}
		else{
			this.tail.setNextNode(newNode);
			this.tail = newNode;
				
			}
		
		
	}
	// poll method remove and return the first item in the list 
	public T poll() {
		Node<T> firstNode = this.head;
		if(firstNode != null) {
			this.head =  firstNode.getNextNode();
			return firstNode.getData();
		}
		return null;
	}
	// return but not remove the first item
	public T peek() {
		if(this.head != null) {
			return this.head.getData();
		}
		return null;
	}
	// remove the first node whose data matches provided key
	public boolean removeBykey(T key) {
		if(key == null) {
			return false;
		}
		Node<T> currentNode = this.head;
		// create a next node after the current
		Node<T> nextNode = currentNode.getNextNode();
		//if the first node mathces the key, move head to next node
		if(currentNode != null && currentNode.getData().equals(key)) {
			this.head = nextNode;
			return true;
		}
		
		//iterate through the list while current node is not Null(end of the list)
		while(currentNode != null) {
			if(nextNode != null && nextNode.getData().equals(key)) {// && makes sure that we only check one side so other side does not run
				currentNode.setNextNode(nextNode.getNextNode()); // skipped over the node we wanted to get rid of
				return true; //other node is de-refenced because the node is completely one sided
			}
			// advance the current node to next node in the list
			currentNode = currentNode.getNextNode();
			// if nextNode is not null, advance the next node to the one after it(house keeping)
			if(nextNode != null) {
				nextNode = nextNode.getNextNode();	
				}
		}
		
		return false;
	}
	// convenience method for printing the list
	public void printlist() {
		Node<T> currentNode = this.head;
		while(currentNode != null) {
			System.out.println("Node location: "+currentNode.hashCode()+" Node vaale: "+currentNode.getData());
			currentNode = currentNode.getNextNode();
		}
	}

}
