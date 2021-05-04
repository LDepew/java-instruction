import java.math.BigDecimal;
import java.text.NumberFormat;
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
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		System.out.println("Loan amount: " + currency.format(loanAmt));
		System.out.println("Interest amount: " + percent.format(interestAmt));
		System.out.println("Interest: " + currency.format(interest));
		System.out.print("Continue? (y/n):");
		choice = sc.next();
		}
		
		
		
		
		
		
		
		
		
		System.out.println("Bye");
	}

}
