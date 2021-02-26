import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodsApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		printWelcomeMessage();
		printWelcomeMessage("Lance");
		System.out.println("55.7 / 6.2 = " + divide(55.7, 6.2));

		int n1 = getInt("Enter a Whole Number: ", sc);
		int n2 = getInt("Enter another Whole Number: ", sc);
		System.out.println("Sum of Numbers [" + n1 + " + " + n2 + "] = " + (n1 + n2));
		
		double d1 = getDouble("Enter a Decimal Value: ", sc);
		System.out.println("Decimal Entered: "+d1);
		
		//p 165 NullPointerException
		String str = null;
		
		if (str.equalsIgnoreCase("Hello")) {
			System.out.println("Hello");
		}
		

		System.out.println("Bye");

	}

	// p. 153 - static method no parms and no return
	private static void printWelcomeMessage() {
		System.out.println("Welcome to the Methods App!!");
	}

	// static method with 1 parm and no return
	private static void printWelcomeMessage(String name) {
		System.out.println("Welcome, " + name + ", to the Methods App!!");
	}

	// static method with 2 parms and return
	private static double divide(double d1, double d2) {
		return d1 / d2;
	}

	// prompt user for a whole # and return whole #
	// uses exception handling
	private static int getInt(String prompt, Scanner sc) {
		int nbr = 0;
		boolean isValid = false;
		while(!isValid) {
			try {
				System.out.print(prompt);
				nbr = sc.nextInt();
				isValid = true;
			}
			catch (InputMismatchException ime) {
				System.out.println("Invalid Entry. Must be a whole number.");
				//clear input from scanner
				sc.nextLine();
			}	
		}
		return nbr;
	}
		
		//prompt for a decimal number and return it... using data validation
		private static double getDouble (String prompt, Scanner sc) {
		double d = 0.0;
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			}
			else {
				System.out.println("Invalid Entry. Must be a decimal number.");
				sc.next();
			}
		}
		
		
		return d;
		
	}
}
