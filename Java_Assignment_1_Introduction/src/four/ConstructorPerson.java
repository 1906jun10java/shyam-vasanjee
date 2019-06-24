package four;

public class ConstructorPerson {
	String name;
	int age;
	// Constructor
	public ConstructorPerson() {
		this.name = "Mischa";
		this.age = 5;
	}
	// Methods or functions
	public String intro() {
		return "Hello my name is " + this.name + " and my age is " + this.age;
	}

	public static void main(String[] args) {
		ConstructorPerson Mischa = new ConstructorPerson();
		System.out.println(Mischa.intro());
		// TODO Auto-generated method stub

	}

}
