import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Dice Roller app");
		Scanner sc = new Scanner(System.in);
		System.out.print("Roll the dice? (y/n) ");
		String choice = sc.next();
		
		//create instance of Dice outside while simply to save memory, garbage collector
		//Dice dice = new Dice();
		
		while (choice.equalsIgnoreCase("y")) {
			//create instance of Dice
			Dice dice = new Dice();
			//roll the dice
			dice.roll();
			//print result
			System.out.println(dice.getRollResultString());
			
			
			
			System.out.println("Roll again (y/n)?");
			choice = sc.next();
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();
		System.out.println("Bye");

	}

}
