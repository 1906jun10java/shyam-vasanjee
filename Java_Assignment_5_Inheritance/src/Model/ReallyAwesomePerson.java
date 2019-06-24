package Model;

public class ReallyAwesomePerson extends AwesomePerson { //derived class
	
	public void talk( ) {
		System.out.println("You've got a different person");//overwrites AwesomePerson's Method
	}
	public static void main (String[] args) {
		ReallyAwesomePerson S = new ReallyAwesomePerson(); // creates ReallyAwesomePerson object that overwrites AP's talk Method
		S.talk();
	}

}
