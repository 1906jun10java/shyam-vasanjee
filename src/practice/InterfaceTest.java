package practice;

public class InterfaceTest implements InterA, InterB {
	
	public InterfaceTest() {
		super();
	}
	
	public void display() { 
		System.out.println("This is not default");
	}
	 public void A(int A) {
		System.out.println("This is InterA: "+InterA.A);
	}
	public void A(int A) {
		System.out.println("This is InterB: "+InterB.A);
	}
	
	public static void main(String[] args) {
		InterfaceTest t = new InterfaceTest();
		t.A(2);
		t.A(2);
		t.display();
	}

}
