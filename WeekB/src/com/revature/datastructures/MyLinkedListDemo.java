package com.revature.datastructures;

import com.revature.model.User;

public class MyLinkedListDemo {
	
	public static void main(String[] args) {
		
		User u1 =  new User("Gandalf", "Grey", "mithrandir", "you_shall_not");
		User u2 = new User("Paul", "Hewson","Bono", "u2Rulez");
		User u3 = new User("David", "Tennant", "doc10", "tardis");

		MyLinkedList<User> userList = new MyLinkedList<>();
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("List before Insertion");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		userList.printlist();
		
		
		userList.insert(u1);
		userList.insert(u2);
		userList.insert(u3);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("List after Insertion");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		userList.printlist();
		
		/*System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Peek test");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Head: "+userList.peek());
		userList.printlist();
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Poll test");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Head: "+userList.poll());
		*/
		User u4 = new User("David", "Tennant", "doc10","tardis");
		userList.removeBykey(u4);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Remove by key test");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		userList.printlist();
	
	}

}
