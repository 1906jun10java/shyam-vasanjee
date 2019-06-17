package challenges;

public class FizzBuzz {
	private int div1;
	private int div2;
	private String wrd1;
	private String wrd2;
			
	public FizzBuzz() {
		
	}

	public FizzBuzz(int div1, int div2) {
		this.div1 = div1;
		this.div2 = div2;
	}

	public int getDiv1() {
		return div1;
	}
	public int getDiv2() {
		return div2;
	}
	public String getWrd1() {
		return wrd1;
	}
	public String getWrd2() {
		return wrd2;
	}
	public void setDiv1(int div1) {
		this.div1 = div1;
	}
	public void setDiv2(int div2) {
		this.div2 = div2;
	}
	public void setWrd1(String wrd1) {
		this.wrd1 = wrd1;
	}
	public void setWrd2(String wrd2) {
		this.wrd2 = wrd2;
	}
	//public String toString() {
	//	String[] terms = {"fizz", "buzz"};
		//int[] num = {3,5};
		//return num[div1] + terms[div2];
	//}
	// method

	public void fizzBuzzBasic(int div1, int div2) {
		if(div1 == 0) {
			System.out.println("Invalid entry");
		}

		for (int x = 1; x <= 100; x++) {
			if (x % div1 == 0 && x % div2 == 0) {
				System.out.println("fizzbuzz");
			} else if (x % div1 == 0) {
				System.out.println("fizz");
			} else if (x % div2 == 0) {
				System.out.println("buzz");
			} else {
				System.out.println(x);
			}
		}
	}

	//String[] terms = new String[] {wrd1, wrd2};

	public void fizzBuzzAdvanced(int div1, int div2) {
		int num[] = {div1, div2};
		String terms[] = {"fizz","buzz"};
		if (div1 == 0 || div2 ==0) {
			System.out.println("Invalid Entry, try again");
		}
		for(int x = 1; x<=100; x++) {
			if(x % num[0] == 0 && x % num[1] == 0) {
				System.out.println(terms[0]+terms[1]);
			}
			else if(x % num[0] == 0) {
				System.out.println(terms[0]);
			}
			else if(x % num[1] == 0) {
				System.out.println(terms[1]);
			}
			else {
				System.out.println(x);
			}
		}
	}


}

