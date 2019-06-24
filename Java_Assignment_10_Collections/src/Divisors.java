
public class Divisors {
	int m;
	int n;
	
	public Divisors(int m) {
		this.m = m;
	}
	public void div() {
		for(n = 1; n <= m; n++) {
			if(m%n == 0) {
				System.out.println(n);
			}
			
		}
		}
	public static void main(String[] args) {
		Divisors c = new Divisors(25);
		c.div();
	}
	

}
