
public class Tires extends CarPart implements Functional {
	private String tireType;
	
	public Tires(int condition, String tireType) {
		super(condition);
		this.tireType = tireType;
	}
	public void Type() {
		System.out.println("The type of tires are " + this.tireType);
	}
	public void function() {
		System.out.println("The tires functions are to move the car safely on the road. ");
	}
	public void status() {
		System.out.println("The tires condition is "+ this.condition);
	}
	public static void main(String[] args) {
		Tires t = new Tires(75, "Goodyear");
		t.function();
		t.status();
		t.Type();
	}

}
