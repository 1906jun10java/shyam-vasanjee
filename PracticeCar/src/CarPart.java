
public class CarPart extends Car implements Functional {
	int condition;
	
	public CarPart(int condition) {
		this.condition = condition;
	}
	public void status() {
		System.out.println("The condition of the car ranges from 0 to 100 and its condition is " + this.condition);
	}
	public void function() {
		System.out.println("The function of the part is ");
	}

}
