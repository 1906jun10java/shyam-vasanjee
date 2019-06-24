package com.revature.datastructures;

public class MyLinkedList<T> {

	public MyLinkedList() {//no parameter constructor
		super();
		// TODO Auto-generated constructor stub
	}
	
	// root node of the list."the head"
	private Node<T> head;// new field, the head of the node
	// instance variable, which gets initialized to the default for its dataType (here:null)
	
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
			this.tail.setNextNode(newNode);//inserts new node at the end of the list
			this.tail = newNode;
				
			}
		
		
	}
	// poll method remove and return the first item(head) in the list 
	public T poll() {
		Node<T> firstNode = this.head;
		if(firstNode != null) {
			this.head =  firstNode.getNextNode();//points to next node
			return firstNode.getData();//returns the first item in the list
		}
		return null;//otherwise no items in the list
	}
	// return but not remove the first(head) item
	public T peek() {
		if(this.head != null) {// check if node is not null first
			return this.head.getData();//revealing the first item of the list
		}//if the list is not empty, acquire the data of the node
		return null;
	}
	// remove the first node whose data matches other node's data
	public boolean removeBykey(T key) {// data is the key
		if(key == null) {
			return false;
		}
		Node<T> currentNode = this.head;
		// create a next node after the current
		Node<T> nextNode = currentNode.getNextNode();//points to next node
		//if the first node matches the key, move head to next node
		if(currentNode != null && currentNode.getData() != null && currentNode.getData().equals(key)) {
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
	// convenience method for printing the list; shows us what is going on!
	
	// remove all duplicate from list
	
	public void removeDuplicate() {
		Node<T> currentNode = this.head;
		Node<T> tempNode;
		T currentValue =  null;
		
		// SysO does not compile because variables in method and block/local scope
		//do Not receive default vales the way the instance and static variables do.
		
		// do we have a list in the first place?
		if(currentNode != null) {
			currentValue = currentNode.getData();	
			System.out.println("at beginning of list, initial value = "+currentValue);
			do {
				System.out.println("beginning outter loop iteration");
				tempNode = currentNode;
				// don't need to re-check earlier nodes in the list
				while(tempNode != null && tempNode.getNextNode() != null) {
					// check for matches
					T nextValue = tempNode.getNextNode().getData();
					System.out.println("comparing values ("+currentValue+ ","+nextValue+")");
					if(currentValue.equals(nextValue)) {
						System.out.println("removing first instance of the value: "+currentValue);
						this.removeBykey(currentValue);
					}System.out.println("moving tempNode to next node");
					tempNode = tempNode.getNextNode();
					
				}
				System.out.println("moving to currentNode to next node");
				if(currentNode.getNextNode() != null) {
					System.out.println("No more duplicates of  "+currentValue+ " left");
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
					this.printlist();
					System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
					currentValue = currentNode.getNextNode().getData();// references next node's value
					currentNode = currentNode.getNextNode();// advance node
				}
				
			}while(currentValue != null && currentNode.getNextNode() != null);
			//exit the iteration if current node's value is null OR there is no next node
			//note: a refinement would be to skip out all nodes with null values
			// instead of quitting as soon as we find one
			
		}
	}
	
	public void printlist() {
		Node<T> currentNode = this.head;
		while(currentNode != null) {
			System.out.println("Node location: "+currentNode.hashCode()+" Node vaale: "+currentNode.getData());
			currentNode = currentNode.getNextNode();
		}
	}

}
