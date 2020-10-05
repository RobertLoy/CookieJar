package cst135n.milestone.practice;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
	
	private static Scanner sc = new Scanner(System.in);

	// Menu to get the user's choice, but NOT handle the branch
	public static int mainMenu(String name) {
		
		// Since we have to return a value, need to declare outside try/catch
		int option = 0;
		// Using a try since we are looking for an int and user may enter a char or String
		try {
			System.out.println("\n\nWelcome to " + name);
			System.out.println("====================");
			System.out.println("1) Add Cake");
			System.out.println("2) Add Cookie");
			System.out.println("3) See all Desserts");
			System.out.println("4) See details of a Dessert");
			System.out.println("5) Update a Dessert");
			System.out.println("6) Delete a Dessert");
			System.out.println("7) Search for a Dessert");
			System.out.println("8) Sort all Dessert (Optional)");
			System.out.println("0) Exit");
			System.out.println("Which option : ");
			option = sc.nextInt();
		}
		catch (Exception e) {
			// If the user enters a non-integer
			option = -1;
		}
		finally {
			// Need to handle the extra line return 
			// whether or not the sc.nextLine() worked.
			sc.nextLine();
		}

		// Return a valid int
		return option;
	}

	// Used to display the items in the List<Dessert>
	public static void displayAll(List<Dessert> sugarRush) {
		
		int counter = 0;
		// Printing out the menu items
		for (Dessert item : sugarRush) {
			System.out.println(counter++ + "]" + item.toMenuString());
		}
	}
	
	public static void searchResults(List<Dessert> sugarRush, String text) {
		
		int counter = 0;
		// Printing out the menu items
		for (Dessert item : sugarRush) {
			if (item.getName().contains(text))
				System.out.println(counter++ + "]" + item.toMenuString());
		}
	}
	
	public static void sortResults(List<Dessert> sugarRush) {
		
		int counter = 0;
		// Printing out the menu items
		Collections.sort(sugarRush, Dessert.nameComparator);
		for (Dessert item : sugarRush) {
			System.out.println(counter++ + "]" + item.toMenuString());
		}
	}
}
