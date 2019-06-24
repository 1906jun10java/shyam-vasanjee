package com.revature.beans;

public class Car extends Vehicle implements Steerable {
	//best practices: explicitly declare a noargs constructor
	//when any constructor is present, we are not provided the default constructor
	
	public Car( ) {
		super();
	}
	public Car(int yearManufactured, String make, String model) {
		super();
		this.yearManufactured = yearManufactured;
		this.make = make;
		this.model = model;
	}
	private int yearManufactured;

	private String make;
	private String model;

	public int getYearManufactured() {
		return yearManufactured;
	}

	public void setYearManufactured(int yearManufactured) {
		this.yearManufactured = yearManufactured;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public void turnRight() {
		// TODO Auto-generated method stub
		System.out.println("Turning wheel clockwise");
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		System.out.println("Turning wheel counterclockwise");
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
		
	}
	
	

}
