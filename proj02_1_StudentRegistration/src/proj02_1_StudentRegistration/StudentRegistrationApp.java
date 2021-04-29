package proj02_1_StudentRegistration;

import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello, Welcome to the Student Registration App!");
		System.out.println(); //blank line space
		System.out.print("Enter first name: ");
		String firstName = sc.next();
		System.out.print("Enter last name: ");
		String lastName = sc.next();
		System.out.println("Enter year of birth: ");
		int birthYear = sc.nextInt();
		System.out.println(); //blank line space
		System.out.println("Welcome " + firstName + " " + lastName + "!");
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: " + lastName + "*" + birthYear);
				
		
		
		System.out.println("Bye!");

	}

}
