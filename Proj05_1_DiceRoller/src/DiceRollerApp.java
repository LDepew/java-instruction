import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Dice Roller");
		System.out.println(); //blank line space
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		System.out.print("Roll the dice? (y/n): ");
		choice = sc.next();
		
		while(choice.equalsIgnoreCase("y")) {
		
		System.out.println(); //blank line space
		
		int die1 = (int) ((Math.random() * 6) + 1);
		int die2 = (int) ((Math.random() * 6) + 1);
		
		System.out.println("Die 1: " + die1);
		System.out.println("Die 2: " + die2);
		System.out.println("Total: " + (die1 + die2));
		
		if (die1 == 1 & die2 == 1) {
			System.out.println("Snake Eyes!");
		}
		if (die1 == 6 && die2 == 6) {
			System.out.println("Box Car!");
		}
		System.out.println(); //blank line space
		System.out.print("Roll again? (y/n): ");
		choice = sc.next();
		}
		
		System.out.println(); //blank line space
		System.out.println("Bye");
	}

}
