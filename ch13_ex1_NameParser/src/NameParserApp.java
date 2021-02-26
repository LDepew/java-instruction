

import java.util.Scanner;

public class NameParserApp {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        int index = name.indexOf(" ");
        int index2 = name.lastIndexOf(" ");
        String firstName = name.substring(0, index);
        String secondName = name.substring(index + 1, index2);
        String thirdName = name.substring(index2 + 1);
        if {
        	name. < 1
        	System.out.println("Invalid entry, try again!");
        }
        else if {
        	index > 2
        	System.out.println("Invalid entry, try again!");
        }
        else {
        System.out.println(name);
        System.out.println(firstName);
        System.out.println(secondName);
        System.out.println(thirdName);
        }
    }
}
