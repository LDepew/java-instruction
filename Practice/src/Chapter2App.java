import java.util.Scanner;

public class Chapter2App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to this Chapter 2 App");
		System.out.println();//blank line space
		System.out.println("There goes a mime.");
		
		double addNbr = 2.315;
		double addNbr2 = 4.5;
		System.out.println(addNbr + addNbr2);
		
		int divideNbr = 4;
		int divideNbr2 = 18;
		System.out.println(divideNbr2 / divideNbr);
	
		String message = "addNbr " + addNbr + "\n"
						+"DivideNbr " + divideNbr2 + "\n" 
						+ "Totals " + (addNbr + addNbr2) + (divideNbr / divideNbr2)
						+ "\n";		
		System.out.println(message);
		
		//this is a single line comment.
		
		/*this is a block
		 * comment. they
		 * look like this*/
		
		
	
	}

}
