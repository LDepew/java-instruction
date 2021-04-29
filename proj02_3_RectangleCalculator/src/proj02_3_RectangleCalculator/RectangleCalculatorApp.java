package proj02_3_RectangleCalculator;

import java.util.Scanner;

public class RectangleCalculatorApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) { 
			
		System.out.println("Welcome to the Area and Perimeter Calculator");
		System.out.println(); //blank line
		System.out.print("Enter length: ");
		double length = sc.nextDouble();
		System.out.print("Enter width: ");
		double width = sc.nextDouble();
		System.out.println("Area: " + length * width);
		System.out.println("Perimeter: " + (2 * length) + (2 * width));
		System.out.println(); //blank line
		System.out.print("Continue? (y/n): ");
		choice = sc.next();
		}
		
		
		System.out.println("Bye");

	}

}
