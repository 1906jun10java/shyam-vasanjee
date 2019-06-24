package com.revature.demo;
//imports every class in the beans package (search at one level with the wildcard *)
import com.revature.beans.*;// just saves you typing 
//import com.revature.beans.Car; => just the Car class
//import static com.revature.somepackage.ClassInSomePackage.* => gives all static members if ClassInSomePackage
//import com.revature.somepackage.ClassinSomePackage.STAICMEMBER => STATICMEMBER
//import static java.lang.Math.PI; => static variables should be put in all caps
public class Thursday {
	public static void main(String[] args) {
		funWithVehicles();
	}
	public static void funWithVehicles() {
		//fully qualified classname = package.Classname, works everytime
		com.revature.beans.Car c = new com.revature.beans.Car(1997, "Mazda","Sundance");
		c.getTopSpeed();
		System.out.println("That "+c.getMake()+" "+c.getModel()+" top speed is "+c.getTopSpeed());
	}

}
