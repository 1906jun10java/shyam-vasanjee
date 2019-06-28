package com.revature.beans;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create an instance of the transportation service
		 */
		TransportationService ts = new TransportationService();
		try {
			ts.drive(null);
			Car c = new Car(1998, "Mustang", "Mustang", 90.0);
			ts.drive(c);
		} catch (MaintenanceException m) {
			// TODO Auto-generated catch block
			m.printStackTrace();
		}
		// attempted to call method on a value that was null
		Car c = new Car(1998, "Mustang", "Mustang", 90.0);

		// now throw an exception
		Car c2 = new Car(1997, "Mustang", "Mustang", 0.0);
		try {
			ts.drive(c2);
		} catch (MaintenanceException m) {
			m.printStackTrace();
		}
		// c2.getModel();
		//another block scope example - c2 is not defined outside of try block
		//from compiler's perspective, there is no guarantee that c2 exists
		// for later: try with resources!
		//Exception is more general than Maintenance
	}

}
