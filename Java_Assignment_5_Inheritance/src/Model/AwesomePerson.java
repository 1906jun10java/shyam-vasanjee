package Model;

public class AwesomePerson extends Person {// child class
	AwesomePerson() {
		this.name = "Todd";// initializes Person's attributes
		this.age = 28;
		System.out.println("In AwesomePerson's constructor... ");
	}
	public void talk( ) {
		System.out.println("Hello my name is " + this.name + " and my age is " + this.age);// Method that uses Parent class's attributes
	}

}
