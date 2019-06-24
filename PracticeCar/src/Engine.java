
public class Engine extends CarPart implements Functional {
	private double no_Cylinders;
	
	public Engine(int condition, double no_Cylinders) {
		super(condition);
		this.no_Cylinders = no_Cylinders;
	}
	public double getNo_Cylinders() {
		return no_Cylinders;
	}

	public void function() {
		System.out.println(" The function of the engine is to convert fuel into mechanical motion");
	}
	public void status() {
		System.out.println("The status of the Engine is " + this.condition + " and has " + this.no_Cylinders + " cylinders.");
	}
	public static void main(String[] args) {
		Engine e = new Engine(85, 8);
		e.function();
		e.status();
	}

}
