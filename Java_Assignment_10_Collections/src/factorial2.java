
public class factorial2 {
	static int factorial(int n) { // variables that change w/in the class
		if(n == 0) {
			return 1;
		}
		else 
			return(n*factorial(n-1));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(factorial(n));
		

	}

}
