import java.util.Scanner;

public class CalcScan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");//takes in a double
		
		while(!sc.hasNext()) {
			System.out.println("Invalid");// hasNext() checks if the input is the correct data type
			sc.next();// finds and returns data type related 
		}
		// while loop checks if input is a double, if true breaks the loop and assigns input as "a"
		// If false, prints out invalid until correct input data type is put in correctly
			
		double a = sc.nextDouble();// Assigns input for the value of "a".
		System.out.println("Enter second number");
		
		while(!sc.hasNext()) {
			System.out.println("Invalid Entry");
			sc.next();
			
		}
		
		double b = sc.nextDouble();
		System.out.println("Enter operation: ");
		String s = sc.next();
		
		Calc c = new Calc(a,b);
		
		if(s.equals("div")) {
			while (b == 0) {
				System.out.println("Invalid entry");
				b = sc.nextDouble();
				c.setB(b);
			}
		}
		if(s.equals("add") || s.equals("+")) {
			c.add();
		}
		else if(s.equals("sub")||s.equals("-")) {
			c.sub();
		}
		else if(s.equals("mul")||s.equals("*")) {
			c.mul();
		}
		else if(s.equals("div")||s.equals("/")) {
			c.div();
		}
		else {
			System.out.println("You dun f'ed up!");
		}
		sc.close();
		

	}

}
