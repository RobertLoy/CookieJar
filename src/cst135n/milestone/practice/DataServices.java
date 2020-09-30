package cst135n.milestone.practice;

import java.util.ArrayList;
import java.util.List;

public class DataServices {

	// Used to write our objects to text file
	public static void write(List<Dessert> sugarRush) {
		System.out.println("\n\nWRITING OUTPUT ... ");
		
	}
	
	// Used to read our previous objects from a text file
	public static List<Dessert> read() {
		
		System.out.println("\n\nREADING INPUT ... ");
		// Create an List of Desserts to send back
		List<Dessert> sugarRush = new ArrayList<>();
		
		// These will get replaced with info from a file
		// But for testing we can use these
		sugarRush.add(new Cake(2, 60, "Chocolate"));
		((Cake)(sugarRush.get(0))).setSlice(10);
		
		Frosting f = new Frosting("Butter Cream");
		((Cake)(sugarRush.get(0))).setFrosting(f);;
		
		sugarRush.get(0).setName("Choocolatae");
		sugarRush.add(new Cake(4, 160, "Wedding"));
		sugarRush.add(new Cake(1, 10, "Birthday"));
		sugarRush.add(new Cookie(60, "Christmas"));
		sugarRush.add(new Cookie(80, "Sugar"));
		
		/***
		 *  Read from file will go here
		 */
		
		return sugarRush;

	}
}
