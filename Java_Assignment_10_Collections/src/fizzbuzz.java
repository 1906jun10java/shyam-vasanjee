import java.util.Scanner;

public class fizzbuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fizzbuzz2();
	}
		public static void fizzbuzz2() {
			Scanner sc =  new Scanner(System.in);
			System.out.println("Range:");// pints out Range:
			int range = sc.nextInt();// creates an object named range that uses sc nextInt();
			System.out.println("Divisor 1:");
			int div1 = sc.nextInt();
			System.out.println("Divisor 2:");
			int div2 = sc.nextInt();
			
			int x = 1;
			while (x<=range) {
				if(x%div1 == 0 && x%div2 == 0) {
					System.out.print("Doge n' kitties,");}
				else if(x%div1 == 0) {
					System.out.print("kitties, ");
				}
				else if (x%div2 == 0){
					System.out.print("Doge, ");
				}
				else {
					System.out.print(x+", ");
				}
				x++;
			}
			
		}
		
		public static void fizzbuzz1() {
			int x = 1;
			while (x<=100) {
				if(x%3 == 0 && x%5 == 0) {
					System.out.println("Doge n' kitties");}
				else if(x%3 == 0) {
					System.out.println("kitties");
				}
				else if (x%5 == 0){
					System.out.println("Doge");
				}
				else {
					System.out.println(x);
				}
				x++;
			}
		}
		
	}

				

			
		

