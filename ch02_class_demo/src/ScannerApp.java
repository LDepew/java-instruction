import java.util.Scanner;

public class ScannerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Scanner!");
		String choice = "y";
		Scanner sc = new Scanner(System.in);
		while (choice.equalsIgnoreCase("y")) {
			// p. 61
			System.out.print("Hi, what is your name? ");
			String name = sc.next();
			String name2 = sc.next();
			System.out.println("Hello " + name + " " + name2);
			// clear the buffer
			sc.nextLine();
			// 'nextLine'
			System.out.print("Enter a Sentence: ");
			String sentence = sc.nextLine();
			System.out.println(sentence);

			// nextInt
			System.out.println("Enter a Whole Number: ");
			int n1 = sc.nextInt();
			System.out.println("You entered: " + n1);
			if (n1 >= 10) {
				System.out.println("Greater than equal to 10");
			}
			else if (n1 <= 10) {
				System.out.println(("Less than equal to 10"));
			}

			// nextDouble
			System.out.println("Enter a decimal number: ");
			double d1 = sc.nextDouble();
			System.out.println("You entered: " + d1);

			System.out.print("Do you want to continue (y/n)? ");
			choice = sc.next();
			if (choice.equals("y")) {
				System.out.println("You entered lower case y");
			}
			else if (choice.equals("k")) {
				System.out.println("k");
			}
			else {
				System.out.println("You entered something else: "+ choice);
			}
		}
		System.out.println("Bye");
		sc.close();
	}

}
