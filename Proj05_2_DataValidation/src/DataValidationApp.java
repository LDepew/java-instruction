import java.util.Scanner;

public class DataValidationApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Perimeter Calculator");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		System.out.println("Enter Length");
		double Length = sc.nextDouble();
		
		
		
		System.out.println("Enter Width");
		double Width = sc.nextDouble();
		
		//Validate entry, calculate area and perimeter
		
		//Display output
		
		//Ask if want to continue
		System.out.println("Continue? (y/n)");
		choice = sc.next();
		
		
		
		public static int getIntWithinRange(Scanner sc, String prompt,
				int min, int max);
			choice = "y"
			boolean isValid = false;
			while (!isValid) {
				System.out.print(prompt);
				if (sc.hasNextInt()) {
					d = sc.nextInt();
					isValid = true;
				}
				else {
					System.out.println("Error! This entry is required. Try Again");
					sc.next();
				}
				
		
		
		
		System.out.println("Goodbye");

	}

}
