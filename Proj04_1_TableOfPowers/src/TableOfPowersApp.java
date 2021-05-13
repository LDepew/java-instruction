import java.util.Scanner;

public class TableOfPowersApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Squares and Cubes table");
		
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
		
		System.out.print("Enter an integer: ");
		int int1 = sc.nextInt();
		
		
		System.out.println("Number   Squared    Cubed");
		System.out.println("======   =======    =====");
		
		for (int i=1; i<= int1; i++) {
			System.out.println(i + "        " + (i*i) + "          " + (i*i*i));
		}
		System.out.print("Continue (y/n)?");
		choice = sc.next();
		}
		

		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Bye");
	}

}
