package ui;

import java.time.LocalDate;

import business.Reservation;
import util.Console;

public class ReservationCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Reservation Calculator!");
		
		int arrivalMonth = Console.getInt("Enter the arrival month: ", 0, 13);
		int arrivalDay = Console.getInt("Enter the arrival day: ", 0, 32);
		int arrivalYear = Console.getInt("Enter the arrival month: ", 0, 12);
		
		int departureMonth = Console.getInt("Enter the departure month: ", 0, 13);
		int departureDay = Console.getInt("Enter the departure day: ", 0, 32);
		int depeartureYear = Console.getInt("Enter the departure month: ", 0, 12);
		
		LocalDate arrivalDate = LocalDate.of(arrivalYear, arrivalMonth, arrivalDay);
		LocalDate departureDate = LocalDate.of(depeartureYear, departureMonth, departureDay);
		
		Reservation res = new Reservation(arrivalDate, departureDate);
		System.out.println("Arrival Date: "+res.getArrivalDateFormatted());
		System.out.println("Departure Date: "+res.getDepartureDateFormatted());
		System.out.println("Price: "+res.getPricePerNightFormatted()+" per night.");
		System.out.println("Total Price: "+res.getTotalPriceFormatted()+" for "
										+ res.getNumberOfNights()+" nights.");
		
		
		
		
		
		
		System.out.println("Bye");
	}

}
