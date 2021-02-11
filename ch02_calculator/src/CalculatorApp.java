
public class CalculatorApp {

	public static void main(String[] args) {
		int n1 = 5;
		int n2 = 8;
		int n3 = 21;
		int n4 = 4;
		
		double d1 = 5.5;
		double d2 = 7.0;
		double d3 = 11.1;
		double d4 = 17.2;
		
		int sum1;
		sum1 = (n1 + n3);
		int diff1;
		diff1 = (n4 - n2);
		int prod1;
		prod1 = (n4 * n2);
		int quotient1;
		quotient1 = (n2 / n3);
		
		double sum2;
		sum2 = (d1 + d2);
		double diff2;
		diff2 = (d3 - d1);
		double prod2;
		prod2 = (d4 * d2);
		double quotient2;
		quotient2 = (d3 / d4);
		
		
		/*
		int sum3;
		sum3 = (n2 + d3);
		double = diff3;
		diff3 = (n4 - d1);
		double = prod3;
		prod3 = (n2 * d4);
		int quotient3;
		quotient 3 = (n3 / d3);
		*/
		
		
		System.out.println("Hello Calculator!");
		System.out.println();//blank line for space
		System.out.println("Here are your calculations!");
		System.out.println();//blank line for space
		System.out.println("Integers - n1 = 5, n2 = 8, n3 = 21, n4 = 4");
		System.out.println("Doubles - d1 = 5.5, d2 = 7.0, d3 = 11.1, d4 = 17.2");
		System.out.println();//blank line for space
		System.out.println("Int:");
		System.out.println("n1 + n3 = " +sum1);
		System.out.println("n4 - n2 = " +diff1);
		System.out.println("n4 * n2 = " +prod1);
		System.out.println("n2 / n3 = " +quotient1);
		System.out.println();//blank line for space
		System.out.println("Double:");
		System.out.println("d1 + d2 = " +sum2);
		System.out.println("d3 - d1 = " +diff2);
		System.out.println("d4 * d2 = " +prod2);
		System.out.println("d3 / d4 = " +quotient2);
		
		
		/*
		System.out.println();
		System.out.println("Mix:");
		System.out.println(sum3);
		System.out.println(diff3);
		System.out.println(prod3);
		System.out.println(quotient3);
		*/
	}

}
