import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Dice Roller");
		System.out.println(); //blank line space
		
		String choice = "y";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Roll the dice? (y/n): ");
		choice = sc.next();
		
		int die1 = (int) ((Math.random() * 6) + 1);
		int die2 = (int) ((Math.random() * 6) + 1);
		
		System.out.println("Die 1: " + die1);
		System.out.println("Die 2: " + die2);

	}

}
