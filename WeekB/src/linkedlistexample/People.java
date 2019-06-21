package linkedlistexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class People {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// reference https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html#listIterator-int-
		List<Integer> list= new ArrayList<>();
		list.add(5);
		list.add(7);
		list.add(-24);
		list.add(13);
		
		System.out.println(list);
		System.out.println("Max: "+findMax(list));
		System.out.println("Min: "+findMin(list));
		System.out.println("Range: "+range(list));
	
}
	public static Integer findMax(List<Integer> list) {
		// checks if the list is empty
		if(list == null || list.size() == 0) {
			return Integer.MIN_VALUE;
		}
		List<Integer> sortedList = new ArrayList<>(list);
		
		Collections.sort(sortedList);
		
		return sortedList.get(0);
		
	}
	
	public static Integer findMin(List<Integer> list) {
		if(list == null || list.size() == 0) {
			return Integer.MAX_VALUE;
		}
		List<Integer> sortedList = new ArrayList<>(list);
		
		Collections.sort(sortedList);
		// picks up the last item in the list 
		return sortedList.get(sortedList.size()-1);
	}
	public static Integer range(List<Integer> list) {
		if(list == null || list.size() == 0) {
			System.out.println("There are no elements in the list: ");
		}
		int Range = findMax(list) - findMin(list);
		
		
		return Range;
	}
	
}

