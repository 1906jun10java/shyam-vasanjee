package Java_Assignment_4_Classes;
// class declaration
public class Dog {
	// class attributes
	String name; 
	String breed;
	int age;
	String color;
	
	// Constructor Declaration of the class
	public Dog(String name, String breed, int age, String color) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	// method 1
	public String getName()
	{
		return name;
	}
	// method 2
	public String getBreed() {
		return breed;
	}
	// method 3
	public int getAge() {
		return age;
	}
	//Method 4
	public String getColor() {
		return color;
	}
	//Override
	public String toString() {
		return ("Hi my name is " + this.getName()+
				". \nMy breed, age and color are " +
				this.getBreed()+ ", " + this.getAge()+
				", and " + getColor())+ ".";
	}
	public static void main(String[] args)
	{
		Dog Shadow = new Dog("Shadow", "Pitbull Terrier", 5 , "Grey");
		System.out.println(Shadow.toString());
	}
}
	


