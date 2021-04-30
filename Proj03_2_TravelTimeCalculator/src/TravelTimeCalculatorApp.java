import java.util.Scanner;

public class TravelTimeCalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome To The Travel Time Calculator");
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
		System.out.print("Enter miles: ");
		double Miles = sc.nextDouble();
		System.out.print("Enter miles per hour: ");
		double MilesPerHour = sc.nextDouble();
		System.out.println(); //blank line space
		System.out.println("Estimated Travel Time");
		System.out.println("---------------------");
		System.out.println("Hours:   " + Math.round(Miles / MilesPerHour));
		System.out.println("Minutes: " + Math.round(Miles/ MilesPerHour));
		choice = sc.next();
		}
		
		
		
		
		
		
		
		
		
		System.out.println("Bye");

	}

}
