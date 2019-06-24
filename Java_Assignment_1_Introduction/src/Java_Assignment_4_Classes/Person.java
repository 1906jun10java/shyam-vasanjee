package Java_Assignment_4_Classes;

public class Person {
	private String name;
	private int age;
	// constructor 
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	// get Methods
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	//override
	public String toString()
	{
		return ("My name is " + this.name + " and I'm " + this.age +" years old.");
	}
	public static void main(String[] args) {
		Person Shyam = new Person("Shyam", 28);
		System.out.println(Shyam.toString());
	}

	

}
