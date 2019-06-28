package project0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Menu {
	private static Scanner sc;// to not write sc everytime

	public static List<Car> cars = new ArrayList<>();

	static void mainMenu() {
		sc = new Scanner(System.in);
		// print menu
		System.out.println("Main Menu\n\n1)Customer Login\n2)Employee Login\n3)Cars\n4)Register\n5)exit\n");
		//
		//List<Car> cars = new ArrayList<>();

		boolean quit = false;

		int menuItem;
		do {
			while (!sc.hasNextInt()) {
				System.out.println("Type in an integer");
				sc.next();
			}

			menuItem = sc.nextInt();

			switch (menuItem) {
			case 1:// customer access
				CuserMenu();
				// do something;
				break;
			case 2:// Employee Access
				empUserMenu();
				// do something;
				break;
			case 3:// Cars available on lot
				System.out.println("cars");
				printCarList(cars);
				// do something;
				break;
			case 4: // Register for online account
				break;
			case 5:// Exit
				System.out.println("Quit!");
				quit = true;
				break;
			default:
				System.out.println("U dun f'ed up...");
			}// continue to loop
		} while (!quit);
		System.out.println("Adios, amigo..");

	}

	static void customerMenu() {
		sc = new Scanner(System.in);
		int custoptn;// customer options keys
		boolean exit = false;
		List<Car> cars = new ArrayList<>();

		System.out.println("Customer realm\n\n1)Payments\n2)Cars owned\n3)Offer\n4)Exit");
		do {
			custoptn = sc.nextInt();

			switch (custoptn) {
			case 1:
				// payments
				// cost/ # of months for loan(monthly bill) subtracted from total cost
				break;
			case 2:
				System.out.println("My cars");// list of cars
				printCarList(cars);
				break;
			case 3:
				System.out.println("Offer available (Accept or decline)");
				break;
			case 4:
				System.out.println("Exit!");
				exit = true;
				break;
			default:
				System.out.println("U dun F'ed up!");
			}
		} while (!exit);
		System.out.println("Au revoir ami!");
		mainMenu();

	}

	static void CuserMenu() {

		sc = new Scanner(System.in);
		boolean exit = false;
		do {
			System.out.println("Enter UserName: ");// prompt user to input username
			while (!sc.hasNext()) {
				System.out.println("Invalid Entry, Try again!");
				sc.next();
			}
			String username = sc.next();
			System.out.println("Enter Password: ");// prompt user to input pass
			while (!sc.hasNext()) {
				System.out.println("Invalid Entry");
				sc.nextLine();
			} // user types pass
			String pass = sc.next();
			System.out.println("Confirm Password: ");
			while (!sc.hasNext()) {
				System.out.println("Invalid Entry");
				sc.nextLine();
			}
			String pass1 = sc.next();
			// Authentication
			if (pass.contentEquals(pass1)) {
				System.out.println("Welcome to Customer Home screen");
				customerMenu();
			} else if (!pass.contentEquals(pass1)) {
				System.out.println("Try again!");
				System.out.println("Would you like to return back to the main menu? Y/N ");
				String answer = sc.next();
				if (answer.contentEquals("Y")) {
					break;
				} else {
					CuserMenu();
				}
			}
		} while (!exit);
		System.out.println("return back to main menu");
		mainMenu();
	}

	static void empUserMenu() {
		sc = new Scanner(System.in);
		boolean exit = false;
		do {

			System.out.println("Enter Employee Id: ");// prompt user to input username
			while (!sc.hasNextInt()) {
				System.out.println("Invalid Entry");
				sc.next();
			}
			int id = sc.nextInt();
			System.out.println("Enter Password: ");// prompt user to input pass
			while (!sc.hasNext()) {
				System.out.println("Invalid Entry");
				sc.next();
			} // user types pass
			String pass = sc.next();
			System.out.println("Confirm Password: ");
			while (!sc.hasNext()) {
				System.out.println("Invalid Entry");
				sc.next();
			}
			String pass1 = sc.next();
			// Authentication
			if (pass.contentEquals(pass1)) {
				System.out.println("Welcome to Customer Home screen");
				employeeMenu();
			} else if (!pass.contentEquals(pass1)) {
				System.out.println("Try again!");
				System.out.println("Would you like to return back to the main menu? Y/N ");
				String answer = sc.next();
				if (answer.contentEquals("Y")) {
					break;
				} else {
					empUserMenu();
				}
			}
		} while (!exit);
		System.out.println("return back to main menu");
		mainMenu();
	}

	static void Inventory() {
		sc = new Scanner(System.in);
		System.out.println("How many cars would you like to add?");
		while (!sc.hasNextInt()) {
			System.out.println("Invalid Entry!");
			sc.next();
		}
		for (int i = sc.nextInt(); i > 0; i--) {
			System.out.println("What is the make of the car you would like to add?");
			String Make = sc.next();
			System.out.println("What is the model of that car?");
			String model = sc.next();
			System.out.println("What year was this car manufactured?");
			while (!sc.hasNextInt()) {
				System.out.println("Invalid Entry!");
				sc.next();
			}
			int yearManufactured = sc.nextInt();
			System.out.println("What color is the car? ");
			String color = sc.next();
			System.out.println("What body style does the car have? ");
			String chassisType = sc.next();
			System.out.println("How much does the car cost?");
			while (!sc.hasNextDouble()) {
				System.out.println("Invalid Entry!");
				sc.next();
			}
			Double cost = sc.nextDouble();
			Car c = new Car(Make, model, yearManufactured, color, chassisType, cost);
			cars.add(c);
		}
		printCarList(cars);
	}

	static void Remove() {
		sc = new Scanner(System.in);
		System.out.println("How many cars would you like to remove?");
		while (!sc.hasNextInt()) {
			System.out.println("Invalid Entry! Try Again..");
			sc.next();
		}

		for (int i = 0; i < sc.nextInt(); i++) {
			System.out.println("What is the make of the car you would like to remove?");
			String Make = sc.next();
			System.out.println("What is the model of that car?");
			String model = sc.next();
			System.out.println("What year was this car manufactured?");
			while (!sc.hasNextInt()) {
				System.out.println("Invalid Entry!");
				sc.next();
			}
			int yearManufactured = sc.nextInt();
			System.out.println("What color is the car? ");
			String color = sc.next();
			System.out.println("What body style does the car have? ");
			String chassisType = sc.next();
			System.out.println("How much does the car cost?");
			while (!sc.hasNextDouble()) {
				System.out.println("Invalid Entry!");
				sc.next();
			}
			Double cost = sc.nextDouble();

			cars.remove(new Car(Make, model, yearManufactured, color, chassisType, cost));

		}
		printCarList(cars);

	}

	static void employeeMenu() {
		// Add cars to lots--X
		// Remove cars from the lot--X
		// View all payments
		// Add or reject pending offer on a car
		sc = new Scanner(System.in);
		int Emploptn;// customer options keys
		boolean exit = false;
		List<Car> cars = new ArrayList<>();

		System.out.println("Employee Access\n\n1)Add/Remove Cars\n2)Cars\n3)Offer\n4)View all payments\n5)Exit");
		do {
			Emploptn = sc.nextInt();

			switch (Emploptn) {
			case 1:// Add and Remove cars
				System.out.println("Would you like to add cars or remove cars?<add/remove>");
				String answer = sc.next();
				if (answer.contentEquals("add")) {
					Inventory();
				} else if (answer.contentEquals("remove")) {
					Remove();
				} else {
					employeeMenu();
				}
				break;
			case 2:// List of cars
				System.out.println("My cars");// list of cars
				printCarList(cars);
				break;
			case 3:// Offers available
				System.out.println("Offer available (Accept or decline)");
				break;
			case 4:
				// View all payments
				System.out.println("View all payments!");

			case 5:
				System.out.println("Exit!");
				exit = true;
				break;
			default:
				System.out.println("U dun F'ed up!");
			}
		} while (!exit);
		System.out.println("Au revoir ami!");

	}

	static void printCarList(List<Car> cars) {
		Iterator<Car> it = cars.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}
}

