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
		
		int random = (int) ((Math.random() * 100) + 1);
		
		System.out.print("Enter number: ");
		int guess = sc.nextInt();
		
		if (random == guess) {
			System.out.println("Equals");
		}
		else {
			System.out.println("Not");
		}

	}

}
