import java.util.Scanner;

public class InterestCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Interest Calculator");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
		System.out.print("Enter loan amount: ");
		double loanamt = sc.nextDouble();
		System.out.print("Enter interest amount: ");
		double interestamt = sc.nextDouble();
		System.out.println(); //blank line space
		System.out.println("Loan amount: " + loanamt);
		System.out.println("Interest amount: " + interestamt);
		System.out.println("Interest: " + (loanamt * interestamt));
		System.out.print("Continue? (y/n):");
		choice = sc.next();
		}
		
		
		
		
		
		
		
		
		
		System.out.println("Bye");
	}

}
