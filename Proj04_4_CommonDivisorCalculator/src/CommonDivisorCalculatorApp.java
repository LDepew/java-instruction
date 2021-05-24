import java.util.Scanner;

public class CommonDivisorCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Greatest Common Divisor Finder");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number:");
		int x = sc.nextInt();
		System.out.print("Enter second number:");
		int y = sc.nextInt();
		
		int divisor = 0;
		
		while (x != 0) {
			while (y >= x) {
				y = y - x;
			}
			divisor = x;
			x = y;
			y = divisor;
		}
		
		System.out.println("Greatest Common Divisor: " + divisor);
		System.out.println(); //blank line space

	}

}
