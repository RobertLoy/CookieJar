package cst135n.milestone.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bakery {

	private static String name = "GCU Bakery";
	private Scanner sc = new Scanner(System.in);

	// Menu of Dessert items
	private List<Dessert> sugarRush = new ArrayList<>();

	Bakery (String name){
		this.name = name;
		// Read in objects from a file
		sugarRush = DataServices.read();
	}

	
	public void close() {
		// Write all objects to a file
		DataServices.write(sugarRush);
	}
	
	public void open() {
		int option = -1;
		
		// Call UserInteface class to display menu
		// But handle the branching of the options
		do {
			// get the user options
			option = UserInterface.mainMenu(name);
			
			// Depending on the option, send the user to the appropriate place
			switch (option) {
			case 1:
				addCake();
				break;
			case 2:
				addCookie();
				break;
			case 3: 
				showDesserts();
				break;
			case 4: 
				showOneDessert();
				break;	
			case 5: 
				updateDessert();
				break;
			case 6: 
				deleteDessert();
				break;
			case 7: 
				searchDesserts();
				break;
			case 8: 
				sortDesserts();
				break;	
			case 0: 
				// This is exit
				break;
			default:
				System.out.println("There was a problem. Try again");
			}

		} while (option != 0);

		System.out.println("Thank you for your business");

	}
	
	private void addCake() {
		System.out.println("Adding a Cake ...");
		System.out.println("What name of cake:");
		String name = sc.nextLine();
		System.out.println("How much sugar in your cake (0 -200g): ");
		int sugar = sc.nextInt();
		sc.nextLine();
		System.out.println("How many layers in your cake (1-5): ");
		int layers = sc.nextInt();
		sc.nextLine();
		System.out.println("How big of slice (0-360): ");
		double slice = sc.nextDouble();
		sc.nextLine();
		System.out.println("What type of frosting: ");
		String frosting = sc.nextLine();
		Cake c = new Cake(layers, sugar, name);
		Frosting f = new Frosting(frosting);
		Slice s = new Slice(slice);
		c.setSlice(slice);
		c.setFrosting(f);
		sugarRush.add(c);
		System.out.println("\n >> CAKE ADDED");
	}
	
	private void addCookie() {
		System.out.println("Adding a Cookie ...");
		System.out.println("What name of cookie:");
		String name = sc.nextLine();
		System.out.println("How much sugar in your cookie (0 -200g): ");
		int sugar = sc.nextInt();
		sc.nextLine();
		System.out.println("What do you want to mix in: ");
		String mixin = sc.nextLine();
		Cookie c = new Cookie(sugar, name);
		c.setMixIn(mixin);
		sugarRush.add(c);
		System.out.println("\n >> COOKIE ADDED");
	}
	
	private void showDesserts() {
		System.out.println("Showing all Dessert ...");	
		UserInterface.displayAll(sugarRush);
	}
	
	private void showOneDessert() {
		System.out.println("Showing one Dessert ...");	
		UserInterface.displayAll(sugarRush);
		System.out.println("Which item to view : ");
		int view = sc.nextInt();
		sc.nextLine();
		System.out.println(sugarRush.get(view));		
	}
	
	private void updateDessert() {
		System.out.println("Updating a Dessert ...");
		UserInterface.displayAll(sugarRush);
		System.out.println("Which item to update : ");
		int opt = sc.nextInt();
		sc.nextLine();
		if (sugarRush.get(opt) instanceof Cake) {
			System.out.println("You picked a CAKE to edit");	
		}
		else if (sugarRush.get(opt) instanceof Cookie) {
			System.out.println("You picked a COOKIE to edit");				
		}
		else {
			System.out.println("You picked a generic Dessert to edit");
		}
		
		// Need to allow user to change a Dessert item
	}
	
	private void deleteDessert() {
		System.out.println("Deleting a Dessert ...");
		UserInterface.displayAll(sugarRush);
		System.out.println("Which item to delete : ");
		int delete = sc.nextInt();
		sc.nextLine();
		sugarRush.remove(delete);
		
		// Need to allow user to remove a Dessert item
	}
	
	private void searchDesserts() {
		System.out.println("Searching for a Dessert ...");
		System.out.println("What named item to search for : ");
		String search = sc.nextLine();
		UserInterface.searchResults(sugarRush, search);

		
		// Need to allow user to search for a Dessert item
	}
	
	private void sortDesserts() {
		System.out.println("Sorting Desserts ...");
		UserInterface.sortResults(sugarRush);

		
		// Need to allow user to sort Desserts by name
	}

}
