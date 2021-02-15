import java.util.Scanner;

public class GradeCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, Welcome to the Grade Converter");
		System.out.println();//blank space line
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input Grade");
		
		
			//int numericalGrade = 0;
			Object letterGrade;
			
			int numericalGrade = sc.nextInt();
			if(numericalGrade >= 88)
				letterGrade = "A" ;
			 else if(numericalGrade >= 80)
				 letterGrade = "B" ;
			 else if(numericalGrade >= 67)
				 letterGrade = "C" ;
			 else if(numericalGrade >= 60)
				 letterGrade = "D" ;
			 else
				 letterGrade = "F" ;
			System.out.println("You received - " + letterGrade);
			
			System.out.println("Bye");
	}

}