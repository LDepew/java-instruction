import java.util.Scanner;

public class TravelTimeCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome To The Travel Time Calculator");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter miles: ");
		double Miles = sc.nextDouble();
		System.out.print("Enter miles per hour: ");
		double MilesPerHour = sc.nextDouble();
		System.out.println(); //blank line space
		System.out.println("Estimated Travel Time");
		System.out.println("---------------------");
		System.out.println("Time " + Miles / MilesPerHour);
		
		
		
		
		
		
		
		
		
		
		System.out.println("Bye");

	}

}
