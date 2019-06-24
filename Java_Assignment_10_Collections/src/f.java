
public class f {
	static int factorial(int n) {
		if (n == 0) {
			return 1;
		} else {
			return (n * factorial(n - 1));
		}
	}

	public static void main(String[] args) {
		int fact = 1;
		int number = 4;
		fact = factorial(number);
		System.out.println("Factorial of " + number + " is " + fact);
		
		String str = "{([])}";
		String str2 = "racecar";
		f.Pal(str);
		f.Pal(str2);
		System.out.println(f.Pal(str2));
		//System.out.println(f.Pal(str2));


	}

	/*
	 * check if a string from start to finish is a palindrome check when there is
	 * only one character return true check if the first and last do not match
	 * return false if there are more than two characters check start < end +1
	 * return isPal(st,s+1,e-1)
	 * 
	 * return true
	 * 
	 */
	public static boolean isPal(String str, int s, int e) {
		if (s == e) {
			return true;
		}
		if ((str.charAt(s)) != (str.charAt(e))) {
			return false;
		}
		if (s < e + 1) {
			return isPal(str, s + 1, e - 1);
		}
		return true;
	}
	
	public static boolean Pal(String str) {
		int n = str.length();
		
		if(n == 0) {
			return true;
		}
		return isPal(str,0,n-1);
	}

}

