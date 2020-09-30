package cst135n.milestone.practice;

import java.util.ArrayList;
import java.util.List;

public class Bakery {

	private static String name = "GCU Bakery";

	// Menu of Dessert items
	private List<Dessert> sugarRush = new ArrayList<>();

	Bakery (String name){
		this.name = name;
		sugarRush = DataServices.read();
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
				updateDessert();
				break;
			case 5: 
				deleteDessert();
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
		// Add user input for Cake here
		
	}
	
	private void addCookie() {
		System.out.println("Adding a Cookie ...");
		// Add user input for Cookie here
	}
	
	private void showDesserts() {
		System.out.println("Showing all Dessert ...");	
		UserInterface.display(sugarRush);
	}
	
	private void updateDessert() {
		System.out.println("Adding a Dessert ...");
		UserInterface.display(sugarRush);
		System.out.println("Which item to update : ");
		
		// Need to allow user to change a Dessert item
	}
	
	private void deleteDessert() {
		System.out.println("Deleting a Dessert ...");
		UserInterface.display(sugarRush);
		System.out.println("Which item to delete : ");	
		
		// Need to allow user to remove a Dessert item
	}

}
