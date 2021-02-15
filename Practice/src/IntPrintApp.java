import java.util.Scanner;

public class IntPrintApp {

	public static void main(String[] args) {
		System.out.println("Hello, this is for practice!");
		System.out.println();//blank line space
		
		String Character1 = "Chance Hope";
		String Character2 = "Progno Signet";
		
		Scanner charChoose = new Scanner(System.in);
		System.out.println("Name your character");
		String charName = charChoose.nextLine();
		System.out.println("You are named " +charName);
		
		
		System.out.println("You have wandered into a dark, sheltered forest."
				+ "The trees have all gone pale with the cold shell of frost"
				+ "in the air. There is not but a whisper around as you survey."
				+ "Sighted in the distance is a peculiar figure.");
		
		
		
		System.out.println("Goodbye");
	}

}
