package com.revature.stringsdemo;

public class FunWithStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// create a new string
		String a= "racecar";
		String b = new String("hello");
		/*
		 * .equals() - inherited from Object, used to check equality not identity
		 * String overrides this to complete the literals
		 */
		System.out.println("string a is equal to string b: "+a.equals(b));
		/*
		 * == to compare primitives OR the value of a REFERENCE
		 * check whether the objects a and b are the same object
		 */
		System.out.println("String a is the same object as String b: "+ (a==b));
		
		// a and b are different objects which point to the same literal in the String pool
		// Syntactically similar to Arrays
		
		StringBuilder sb = new StringBuilder(4);
		
		System.out.println(sb.reverse());
		sb.append(" java");
		
		System.out.println(sb.substring(0,4));
		
		System.out.println(sb.capacity());
		
		
		
		
		
		
	}


}
