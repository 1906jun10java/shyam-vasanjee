package com.revature.beans;

public class TransportationService {
	
	
	// any checked exceptions which can be thrown within the method must be listed
	// in the declaration
	public void drive(Car c) throws MaintenanceException{
		// Avoid the NullPointer exception
		// Always assume user is both stupid and malicious (baby-proofing a house)
		// make sure you actually have a car to work with - avoid NullPoinerExceptions!
		// unchecked Exception
		if (c != null) {
			if (c.getFuelLevel() > 0) {

				System.out.println(c.getMake() + " " + c.getModel() + " is driving");
			}else {
				throw new MaintenanceException("not enough fuel");
			}
		}

	}

}
