import java.util.Scanner;

public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Letter Grade Converter");
		Scanner sc = new Scanner(System.in);
		
		//ask to enter numerical grade
		System.out.println("Enter Numerical Grade: ");
		System.out.println("Error! Invalid Integer. Try Again");
		
		
		//convert to Letter
		
		//Display output
		
		String letter = null;
		System.out.println("Letter Grade: "+letter);
        
		
		
		
		
		
		System.out.print("Continue? (y/n): ");
        String choice = sc.next();
        sc.nextLine();  // discard any other data entered on the line
        System.out.println();
		
		System.out.println("Bye");

	}

}
