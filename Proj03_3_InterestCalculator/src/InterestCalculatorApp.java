import java.math.BigDecimal;
import java.util.Scanner;

public class InterestCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Interest Calculator");
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
		System.out.print("Enter loan amount: ");
		BigDecimal loanAmt = sc.nextBigDecimal();
		System.out.print("Enter interest amount: ");
		BigDecimal interestAmt = sc.nextBigDecimal();
		System.out.println(); //blank line space
		BigDecimal interest = loanAmt.multiply(interestAmt);
		System.out.println("Loan amount: " + loanAmt);
		System.out.println("Interest amount: " + interestAmt);
		System.out.println("Interest: " + interest);
		System.out.print("Continue? (y/n):");
		choice = sc.next();
		}
		
		
		
		
		
		
		
		
		
		System.out.println("Bye");
	}

}
