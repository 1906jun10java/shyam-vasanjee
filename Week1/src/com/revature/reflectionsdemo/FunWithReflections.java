package com.revature.reflectionsdemo;

import java.lang.reflect.Field;
import java.util.Arrays;

import com.revature.beans.Car;

public class FunWithReflections {

	public static void main(String[] args) {
		// declaration is everything
		// Signature is the method name and the parameters

		/*
		 * Reflections Api
		 * 
		 * Allows us to inspect objects and classes in runtime
		 * 
		 * First get class by its fully qualified classname (Package.ClassName)
		 * 
		 * instanceof operator allows a runtime check on an object's type gives us some
		 * saftey when down casting (relating to Reflections)
		 *
		 * declared type is an object actual type is car
		 */
		Object o = new Car(2003, "Lambirghini", "Gallardo", 0.0);
		System.out.println("is " + o + " a car? " + isItACar(o));

		try {
			// can throw a checked exception - ClassNotFoundException
			Class clazz = Class.forName("com.revature.beans.Car");
			System.out.println(clazz.getTypeName());

			// get the field of a Car
			Field[] fields = clazz.getDeclaredFields();
			System.out.println(Arrays.toString(fields));
			for (Field f : fields) {
				System.out.println(f.getName());
				// remember Yesterday? String.split(); could use it to divide fields comma
				String[] redundantFieldArray = Arrays.toString(fields).split(",");
				for (String s : redundantFieldArray) {
					System.out.println(s);
				}
				Car c = (Car) clazz.newInstance();
				Field yearManufactured = clazz.getDeclaredField("yearManufactured");
				yearManufactured.setAccessible(true);
				// this breaks encapsulation
				yearManufactured.set(c, 1998);
				System.out.println(c);

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
//if you're doing the same thing in EveryCatch Block
	}

	static boolean isItACar(Object o) {
		boolean b = o instanceof Car;
		return b;

	}

}
