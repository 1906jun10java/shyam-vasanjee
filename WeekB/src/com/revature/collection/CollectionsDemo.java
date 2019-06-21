package com.revature.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

// importing all classes and interfaces from com.revature.model
import com.revature.model.User;
public class CollectionsDemo {
	public static void main(String[] args) {
		funWithIterator();
	}
	public static void funWithLists() {
		/*
		 * List:
		 * 
		 * Lists are ordered Collections
		 * Duplicate elements allowed
		 * 
		 * Some additional List features( beyond methods defined in Collection):
		 * Positional access: access/manipulate elements based on position in list
		 * Search: search for an element and retrieve its numerical position
		 * Iteration: listIterater() expands on capabilities of Iterator
		 * Range-view: access/manipulate subsets of the list
		 * 
		 */
		List <User> users = new ArrayList<>();
		// Implicit up-cast from ArrayList to List
		// generally want to use the supertype of whatever Collection
		// User is the type of each element in the list, replaces the generic type parameter in List<E>
		User u1 =  new User("Gandalf", "Grey", "mithrandir", "you_shall_not");
		User u2 = new User("Paul", "Hewson","Bono", "u2Rulez");
		User u3 = new User("David", "Tennant", "doc10", "tardis");
		
		users.add(u1);
		users.add(u2);
		users.add(u3);
		// we have an addAll() method, but it takes a Collection
		// duplicates are allowed
		users.add(u1);
		for(User user: users) {
			System.out.println(user);
		}
		// figure out the size
		users.size();
		System.out.println("----------------------------------------------");
		// List of integers
		List<Integer> integerList =new Vector<>();
		// must use a wrapper class integer to have numeric value
		// wrapper class is a data type that wraps around a primitive value
		// every primitive data type has a corresponding wrapper class
		integerList.add(10);// implicitly converting from int (primitive) to Integer(Object). This is called "auto-boxing".
		integerList.add(-255);
		integerList.add(new Integer(9));// not "auto-boxing"
		integerList.add(75);
		integerList.add(-12);
		
		Collections.sort(integerList);
		System.out.println("integer list, sorted");
		
		for(Integer integer: integerList) {
			System.out.println(integer);//integer is only defined with in the loop
		}
		/*
		 * Collection utility class has static methods foe operating on Collection objects
		 * 
		 * sort() must be used with a Collection of Comparable elements -- interface Comparable implements compareTo() 
		 * to specify a natural ordering 
		 * (or be provided a Comparator for that datatype)
		 * for datatype that have an existing ordering, you need to set up the compareTo()
		 * 
		 */
		System.out.println("-------------------------------------------------");
		
	}
	
	public static void funWithSets() {
		/*
		 * Set:
		 * 
		 * Unordered and duplicate elements are not allowed
		 * Two sets are equals if they have the same elements (enforced by equals() and hashCode() implementations)
		 * 
		 * documentation for Set
		 * 
		 */
		Set<User> userSet = new HashSet<>();
		
		User u1 =  new User("Gandalf", "Grey", "mithrandir", "you_shall_not");
		User u2 = new User("Paul", "Hewson","Bono", "u2Rulez");
		User u3 = new User("David", "Tennant", "doc10", "tardis");
		
		
		
		userSet.add(u1);
		userSet.add(u2);
		userSet.add(u3);
		
		//no duplicates... addition of duplicate elements will be ignored
		userSet.add(u1);// same object ( according to ==) as an existing element
		User u4 = new User("David", "Tennant", "doc10", "tardis");
		userSet.add(u4);// different object( according to ==) with the same fields as an existing element
		
		
		// both are ignored, it's the .equals() comparison that's being used (equality, not identity)
		
		for(User user: userSet) {
			System.out.println(user);
			// ignores order the items were put in
			System.out.println("-------------------------------------------------------------");
		}
		
		}
	public static void funWithQueues() {
		/*
		 * Queue:
		 * 
		 * typically if we're holding elements while waiting to process them
		 * provide method for adding, removing, and inspecting elements
		 * Two versions for each of these behaviors: one which throws an exception if the operation fails,
		 * and one which does not
		 * FIFO - (first-in, first-out, except for the Priority Queue, which uses a Comparator or elements' naturals ordering
		 * duplicates are allowed
		 * 
		 */
		
		LinkedList<User> userQueue = new LinkedList<>();
		
		User u1 =  new User("Gandalf", "Grey", "mithrandir", "you_shall_not");
		User u2 = new User("Paul", "Hewson","Bono", "u2Rulez");
		User u3 = new User("David", "Tennant", "doc10", "tardis");
		
		
		
		userQueue.add(u1);
		userQueue.add(u2);
		userQueue.add(u3);
		userQueue.add(u1);
		
		while(userQueue.size() != 0) {
			System.out.println("Queue Size: "+userQueue.size());
			System.out.println("Processing "+ userQueue.poll());// removes and returns head of queue
			//Usually peek(), poll(), offer(), and add()
		}
		
		//Collections Utility class --> collection objects
		//Collection --> interface
		//collection --> general grouping of objects
		
	}
	public static void funWithMaps() {
		/*
		 * Map:
		 * object which maps keys to values
		 * every key may map to at most one value
		 * most implementations allow keys to be null
		 * order does not matter because a Set does not come in ordered
		 * https://docs.oracle.com/javase/8/docs/api/java/util/Map.html
		 * 
		 */
		Map <String, String> credentialMap = new HashMap<>();
		credentialMap.put("mithrandir", "you_shall_not");
		credentialMap.put(null, " ");// is fine as long as there is only one null key
		credentialMap.put("bono", null);// null values can be repeated
		credentialMap.put("bono2", null);
		credentialMap.put("doc10", "tardis");
		
		//retrieve objects by their keys
		System.out.println(credentialMap.get("doc10"));
		for(Map.Entry<String, String> entry: credentialMap.entrySet()) {// Map.entry is an example of abstraction and polymorphism
			System.out.println("Key: "+entry.getKey()+" , Value: "+entry.getValue());// allows us to traverse through a map
		}
	}
	public static void funWithIterator() {
Set<User> userSet = new HashSet<>();
		
		User u1 =  new User("Gandalf", "Grey", "mithrandir", "you_shall_not");
		User u2 = new User("Paul", "Hewson","Bono", "u2Rulez");
		User u3 = new User("David", "Tennant", "doc10", "tardis");
		
		/*
		 * Iterator
		 * 
		 * Initialize a collection (extends Iterable interface)
		 * Iterable is an interface which is extended by Collection
		 * Iterable provides methods for easy traversal of any concrete sub-type
		 * 			defines iterator() method which return an Iterator
		 *  Iterator ha methods .next(), hasNext(), remove()
		 *  using the Iterator allows us to safely remove elements in place and traverse multiple Collections at once 
		 * 
		 */
		Iterator<User> userIterator = userSet.iterator();
		//use hasNext() returns boolean as the condition for the while loop
		while(userIterator.hasNext()) {
			User u = userIterator.next();// next() returns the next element and steps forward the position of the iterator
			// could use .remove() to remove elements from the Collection(filtering Collection) 
			System.out.println(u);
		}
		}

}
