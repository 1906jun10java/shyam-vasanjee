import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		//String input
		String name = sc.nextLine();
		//Character input
		char gender = sc.next().charAt(0);
		//Numerical input
		int age = sc.nextInt();
		long mobileNo = sc.nextLong();
		double cgpa = sc.nextDouble();
		
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("MobileNo: "+mobileNo);
		System.out.println("Cgpa: "+cgpa);
	}

}
