
public class EuclidsAlgo {
	int a;
	int b;

	public int gcd(int a, int b) {
		if (b==0) {
			return a;
		}
		else {
			return gcd(b,a%b);
		}
	 
	}
	

	public static void main(String[] args) {
		EuclidsAlgo s = new EuclidsAlgo();
		System.out.println(s.gcd(5,15));
		// TODO Auto-generated method stub

	}

}
