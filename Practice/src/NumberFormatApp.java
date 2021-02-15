import java.text.NumberFormat;

public class NumberFormatApp {

	public static void main(String[] args) {
		System.out.println("Hello this is Number formatting!");
		System.out.println();//blank line space
		
		int num1 = 7454;
		int num2 = 8473;
		
		double num3 = 85474.4334;
		double num4 = 8475.8365;

		System.out.println("Basic Addition");
		System.out.println();//blank line space
		double Add1 = (num1 + num3);
		double Del1 = (num2 - num4);
		NumberFormat addition = NumberFormat.getInstance();
		System.out.println(Add1);
		NumberFormat deletion = NumberFormat.getNumberInstance();
		System.out.println(Del1);
		System.out.println();//blank line space
		
		System.out.println("Basic Multiplication");
		System.out.println();//blank line space
		double Mult1 = (num4 * num2);
		double Div1 = (num3 / num1);
		NumberFormat multiplication = NumberFormat.getNumberInstance();
		System.out.println(Mult1);
		NumberFormat division = NumberFormat.getNumberInstance();
		System.out.println(Div1);
		
		
	
		
		System.out.println("Bye");
		
	}

}
