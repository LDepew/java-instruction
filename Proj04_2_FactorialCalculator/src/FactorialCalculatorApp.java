import java.util.Scanner;

public class FactorialCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Factorial Calculator");
		
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter and integer: ");
		int input = sc.nextInt();
		long fact = 1;
		
		for (int i=1; i<= input; i++) {
			fact = fact * i;
		}
		System.out.println("The factorial of " +input+ " is " +fact);
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Bye");

	}

}
}