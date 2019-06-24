
public class FuelTank extends CarPart implements Functional {
	private int tank;
	public FuelTank(int condition) {
		super(condition);
	}
	public void function() {
		System.out.println("The fuel tank holds the gas for the car which allows all the components to work.");
	}
	public int getTank() {
		return tank;
	}
	public void full(int tank) {
		if (tank == 100) {
			System.out.println("The fuel tank is full.");
		}
		else if(tank < 100 && tank > 0){
			System.out.println("The fuel tank is losing gas.");
		}
		else {
			System.out.println("The fuel tank is empty.");
		}
			
	}
	public void status() {
		System.out.println("The status of the fuel tank is " + this.condition);
	}
	public static void main(String[] args) {
		FuelTank f = new FuelTank(90);
		f.function();
		f.status();
		f.full(95);
		
	}

}
