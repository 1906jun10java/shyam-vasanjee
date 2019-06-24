
public class HashAndEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Patrick",19);
		Student s2 = new Student("Patrick", 19);
		
		System.out.println("Student1's hashcode "+s1.hashCode());
		System.out.println("Student2's hashcode "+s2.hashCode());
		System.out.println("Are the students equivalent? "+s2.equals(s1));

	}

}
