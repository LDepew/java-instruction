import java.util.Scanner;

public class FantasyApp {

	public static void main(String[] args) {
		System.out.println("Legend of the Blue Eye");
		System.out.println("A Fantasy Text Adventure");
		System.out.println();//blank line space
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		System.out.println("You awaken. The light slowly drips into your eyes"
				+ "as you crawl from your slumber.\n You feel faint, like you have"
				+ "been slipped a drowsing potion or an ill begotten meal.\n You"
				+ "cannot remember what happened the night before. All you know"
				+ "is there your head is\n pounding, and your vision is somewhat"
				+ "clouded. You look around. Through the haziness\n of your eyes"
				+ "you can make out a small room, not much bigger than a broom"
				+ "closet.\n There is not much sound, except for the faint breeze"
				+ "outside, and occasional mouse\n scurrying to it's meal. There"
				+ "seem to be so many questions, but what are the answers?");
		System.out.println();//blank line space
		
		System.out.println("What would you like to do?");
		System.out.println();//blank line space
		
		System.out.println("Pick an option:");
		choice = sc.next();
		
		while (choice.equalsIgnoreCase("y"))
		
		switch(choice) {
		case "Get out of bed":
			System.out.println("You arise from the bed. Looking Around You notice"
					+ "a lit candle on a bedside with a note. It is written in"
					+ "a weird language you cannot seem to understand. You pocket"
					+ "it.");
			break;
		case "Freak out":
			System.out.println("You jump from the bed, searching frantically about"
					+ "for something---");
			break;
		case "Go back to sleep":
			System.out.println("You go back to sleep, forgetting you ever awoke.");
			break;
		}

	}

}
