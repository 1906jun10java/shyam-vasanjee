package com.revature.beans;

public class Car extends Vehicle implements Comparable<Car>{
	//best practices: explicitly declare a noargs constructor
	//when any constructor is present, we are not provided the default constructor
	
	public Car( ) {
		super();
	}
	public Car(int yearManufactured, String make, String model, Double fuelLevel) {
		super();
		this.yearManufactured = yearManufactured;
		this.make = make;
		this.model = model;
		this.fuelLevel = fuelLevel;
		
		
		
	}
	private int yearManufactured;
	private Double fuelLevel;
	private String make;
	private String model;
	private TransmissionType transmissionType = TransmissionType.MANUAL;// TransmissionType is its own data type

	public Double getFuelLevel() {
		return fuelLevel;
	}
	public void setFuelLevel(Double fuelLevel) {
		this.fuelLevel = fuelLevel;
	}
	// autoboxing the primitive int value of the instance variable into
	// an instance of its wrapper class (Integer)
	public Integer getYearManufactured() {
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

	public TransmissionType getTransmissionType() {
		return transmissionType;
	}
	public void setTransmissionType(TransmissionType transmissionType) {
		this.transmissionType = transmissionType;
	}
	@Override
	public String toString() {
		return "Car [yearManufactured=" + yearManufactured + ", fuelLevel=" + fuelLevel + ", make=" + make + ", model="
				+ model + ", transmissionType=" + transmissionType + "]";
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
	}
	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		// order the cars by make
		
		return this.make.compareTo(getMake());
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((fuelLevel == null) ? 0 : fuelLevel.hashCode());
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((transmissionType == null) ? 0 : transmissionType.hashCode());
		result = prime * result + yearManufactured;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (fuelLevel == null) {
			if (other.fuelLevel != null)
				return false;
		} else if (!fuelLevel.equals(other.fuelLevel))
			return false;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (transmissionType != other.transmissionType)
			return false;
		if (yearManufactured != other.yearManufactured)
			return false;
		return true;
	}
	
	
	

}
