package ui;

import java.util.Arrays;
import java.util.Scanner;

public class BattingStatisticsApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Batting Average Calculator");
		System.out.println();//blank line space
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of times at bat: ");
		System.out.println();//blank line space
		int size=sc.nextInt();
		int[] Stats = new int[size];
		for(int i=0; i<size; i++) {
			System.out.println("Enter Result for at-bat: ");
			Stats[i] = sc.nextInt();
		}
		
		System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");
		System.out.println();//blank line space
		
		for(int i=0; i<Stats.length; i++) {
			System.out.println("Result for at-bat: "+Stats[i]);
		}
		System.out.println();//blank line space
		double sum = 0;
		for(int i=0; i<Stats.length; i++)
			sum = sum + Stats[i];
		double batAvg = sum / Stats.length;  
		System.out.println("Batting Average: "+batAvg);
		System.out.println();//blank line space
		double percentage = 0;
		percentage = (double)(((Stats.length)/size));
		System.out.println("Slugging Percent: "+percentage);
		
		

		

		
		
		
		
		
		
		
		System.out.println("Bye!");

		}

}

