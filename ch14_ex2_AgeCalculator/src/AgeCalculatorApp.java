import java.text.Format;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Formatter;
import java.util.Scanner;

public class AgeCalculatorApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Age Calculator\n");
        
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        // Get input from the the user
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        // Get and validate user's date of birth
        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        String dateOfBirthString = sc.nextLine();
        System.out.println(dateOfBirthString);
        
        // If user's date of birth is valid
            // Format and print user's date of birth
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        String date = dateOfBirthString;
        LocalDate birthDate = LocalDate.parse(dateOfBirthString, formatter);
            System.out.println("Your date of birth is "+formatter.format(birthDate));
            // Format and print the current date
            DateTimeFormatter sdf = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
            System.out.println("The current date is "+sdf.format(currentDate));

            // Calculate and print the user's age
            long numDays = ChronoUnit.DAYS.between(birthDate, currentDate);
            
            if
            	(currentDate.isBefore(birthDate)));
            }
            else {
            	System.out.println("Invalid Birthday, enter correct date!");
            }
            
             
            //Now access the values as below
            System.out.println("Your age is "+numDays);
    }
}