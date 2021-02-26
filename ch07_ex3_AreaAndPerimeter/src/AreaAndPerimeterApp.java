import java.util.Scanner;

public class AreaAndPerimeterApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Area and Perimeter Calculator");
        System.out.println();

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get input from user
            System.out.print("Enter length: ");
            double length = Double.parseDouble(sc.nextLine());

            System.out.print("Enter width:  ");
            double width = Double.parseDouble(sc.nextLine());
            
			Rectangle r = new Rectangle(length, width);

            // calculate total
            //double area = width * length;
            //double perimeter = 2 * width + 2 * length;
            
            // format and display output
            //NumberFormat number = NumberFormat.getNumberInstance();
            //number.setMinimumFractionDigits(3);
            String message = 
                "Area:         " + r.getArea() + "\n" +
                "Perimeter:    " + r.getPerimiter() + "\n";
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        System.out.println("Bye!");
    }  
}
