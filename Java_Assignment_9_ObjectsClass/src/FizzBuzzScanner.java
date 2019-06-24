import java.util.Scanner;

public class FizzBuzzScanner {
		
			

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int index = 1;
			int div1;
			int div2;
			int range;
			Scanner funkyScanner = new Scanner(System.in);
			
			// validation scannerness
			//System.out.println("What shall ye input 'ere for index?");
			// hasNextInt..literally, "has int"
			//while (!funkyScanner.hasNextInt()) {
				//System.out.println("Invalid...try again....dear soul");
				//funkyScanner.next(); // loops it ...try again
			//}
				//nextLine NEEDS nextLine to...go to the next line..maybe?? speople thought....  didn't need it here tho...
			//index = funkyScanner.nextInt();
			//funkyScanner.nextLine();
			
			
			System.out.println("What shall ye input 'ere for divisor 1?");
			
			while (!funkyScanner.hasNextInt()) {
				System.out.println("Invalid...try again....dear soul");
				funkyScanner.next();// breaks loop
			}
			
			div1 = funkyScanner.nextInt();
			
			System.out.println("What shall ye input 'ere for divisor 2?");
			while (!funkyScanner.hasNextInt()) {
				System.out.println("Invalid...try again....dear soul");
				funkyScanner.next();
			}
			div2 = funkyScanner.nextInt();
			
			System.out.println("What shall ye input 'ere for range?");
			while (!funkyScanner.hasNextInt()) {
				System.out.println("Invalid...try again....dear soul");
				funkyScanner.next();
			}
			range = funkyScanner.nextInt();
			
			funkyScanner.close();
			
			
			for(index = 1; index <= range; index++) {
				if(index % div1 == 0 && index % div2 == 0) {
					System.out.println("Doge n' kitties");}
				else if(index % div2 == 0) {
					System.out.println("kitties");
				}
				else if (index % div2 == 0){
					System.out.println("Doge");
				}
				else {
					System.out.println(index);


				}
			}
		}
}
