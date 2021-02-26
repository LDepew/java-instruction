import java.awt.Choice;
import java.text.NumberFormat;
import java.time.Month;


public class MonthSelectorApp {

    public static void main(String[] args) {
        System.out.println("Monthly Sales\n");
        
        // declare monthNames and monthSales arrays
        String[] monthName = new String[12];
        
        monthName[0] = "January";
        monthName[1] = "February";
        monthName[2] = "March";
        monthName[3] = "April";
        monthName[4] = "May";
        monthName[5] = "June";
        monthName[6] = "July";
        monthName[7] = "August";
        monthName[8] = "September";
        monthName[9] = "October";
        monthName[10] = "November";
        monthName[11] = "December";
        
        double[] monthSales = new double[12];
        
        monthSales[0] = 59473;
        monthSales[1] = 93765;
        monthSales[2] = 30657;
        monthSales[3] = 30573;
        monthSales[4] = 13768;
        monthSales[5] = 44767;
        monthSales[6] = 64654;
        monthSales[7] = 87255;
        monthSales[8] = 82545;
        monthSales[9] = 25665;
        monthSales[10] = 73244;
        monthSales[11] = 83965;


        // get currency formatting
		NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // get one or more months
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            int monthNumber = Console.getInt("Enter month number: ");
            


        
        
      
        //validate input
        if (monthNumber < 1 || monthNumber > monthName.length) {
        	Console.displayLine("Invalid month number. Try again.");
        	continue;                
        }
       
        
//        for (String mn: monthName) {
//			System.out.println(mn);
//		}		
//        for (double ms: monthSales) {
//			System.out.println(ms);
//		}		
        
        //System.out.println(monthSales);
        for (int i = 0; i < monthName.length;) {
        	for (int j = 0; j < monthSales.length;)
        		System.out.println("The Sales for "+monthName[i]
        				+" is " +monthSales[j]);
        }
        
        
        
        // get the index number for the month
        // and display the month name and sales            
       
        // display the total sales for the year
        
        //check if the user wants to continue
       choice = Console.getString("Continue? (y/n): ");
       Console.displayLine();
        }
        
        Console.displayLine();
    }    

}
