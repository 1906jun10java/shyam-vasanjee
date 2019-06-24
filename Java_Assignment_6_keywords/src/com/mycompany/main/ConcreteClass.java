package com.mycompany.main;

public class ConcreteClass extends AbstractClass {
	void run() {
		System.out.println("running safely!");
	}
	public static void main(String[] args) {
		ConcreteClass e = new ConcreteClass();
		e.run();
	}

}
