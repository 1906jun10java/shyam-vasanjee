package com.revature.beans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class FunWithComparisons {
	
	public static void main(String[] args0) {
		
		List<Car> carList = new ArrayList<>();
		carList.add(new Car(1997, "Mustang","Mustang", 0.0));
		carList.add(new Car(1999, "Nissan","GTR", 0.0));
		carList.add(new Car(1993, "Porsche","911 Turbo S", 0.0));
		carList.add(new Car(1997, "Ford","Taurus", 0.0));
		carList.add(new Car(2035, "Tesla","Spaceship", 100.0));
		System.out.println("Cars before sort: ");
		printCars(carList);
		sortWithComparable(carList);
		System.out.println("Cars after sort: ");
		printCars(carList);
		sortWithComparator(carList, new CarYearCompare());
		System.out.println("Cars after sort with CarYearCompare: ");
		printCars(carList);
		sortWithComparator(carList, new CarModelComparator());
		System.out.println("Cars after sort with CarModelComparator: ");
		printCars(carList);
		
		
		
	}
	
	static void sortWithComparator(List<Car> cars, Comparator<Car> carComp) {
		Collections.sort(cars, carComp);
	}
	static void sortWithComparable(List<Car> cars) {// Object in HeapMemory is changing
		Collections.sort(cars);
	}
	static void printCars(List<Car> cars) {
		Iterator<Car> it = cars.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
