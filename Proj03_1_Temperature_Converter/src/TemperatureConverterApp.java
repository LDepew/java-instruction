import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		System.out.println();//blank line space
		
		Scanner sc = new Scanner(System.in);
		
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")); {
		System.out.println("Please Enter Temperature in Fahrenheit");
			double TempF = sc.nextDouble();
			double TempC = (TempF) * 5/9;
			
			
			DecimalFormat df = new DecimalFormat("0.00");
			
			System.out.println(TempF + " In Celsius is: " +df.format(TempC));
			System.out.println();//blank line space
			System.out.println("Run Again?");
			choice = sc.next();
			
			
		} System.out.println("Thank you, Goodbye");

	}

	
		
	}


