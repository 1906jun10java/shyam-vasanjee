
public class Calc {
	private double a;
	private double b;
	
	public Calc(double a, double b) {
		this.a =a;
		this.b = b;
		
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}
	// Arithmetic operations
	public double add() {
		System.out.println(a+b);
		return a+b;
	}
	public double sub() {
		System.out.println(a-b);
		return a-b;
		
	}
	public double mul() {
		System.out.println(a*b);
		return a-b;
	}
	public double div() {
		System.out.println(a/b);
		return a/b;
	}

}
