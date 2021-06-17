import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Guess the Number Game");
		System.out.println("++++++++++++++++++++++++++++++++++++");
		System.out.println(); //blank line space
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("I'm thinking of a number from 1 to 100.");
		System.out.println("Try to guess it.");
		System.out.println(); //blank line space
		
		String choice = "y";
		while(choice.equalsIgnoreCase("y")) {
			
		int random = (int) ((Math.random() * 1) + 1);
		
		int guess = 0;
		
		while(random != guess) {		
		
		System.out.print("Enter number: ");
		int guess2 = sc.nextInt();
		guess2 = guess;
		
		if (random == guess) {
			System.out.println("Equals");
		}
		else {
			System.out.println("Not");
		}
		System.out.println("Guess Again");
		choice = sc.next();
		}
		System.out.println("Try Again? (y/n):");
		choice = sc.next();
		}
		
		System.out.println("Bye - Come back soon!");

	}

}
