package ui;

import java.io.IOException;

import util.Console;

public class MovieRatingsApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Movie Ratings App!!!");
			String command = "";

			while (!command.equalsIgnoreCase("6")) {
				System.out.println("What do you want to do?");
				System.out.println("1 - Enter a Movie");
				System.out.println("2 - View Top Rated Movies");
				System.out.println("3 - View Most Recent Movies");
				System.out.println("4 - View All Movies");
				System.out.println("5 - View Ratings");
				System.out.println("6 - Quit Application");
				String[] validEntries = { "show", "add", "addact", "get", "del", "upload", "login", "exit" };
				command = Console.getRequiredString("Choose a menu option: ");
				switch (command) {
		
		
		
		
		
		
		
		
		
		System.out.println("Bye");
	}

}
