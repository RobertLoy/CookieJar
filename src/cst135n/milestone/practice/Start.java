package cst135n.milestone.practice;
import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) {
		
		// Menu of Dessert items
		List<Dessert> sugarRush = new ArrayList<>();
		
		
		// Adding items to the menu
		sugarRush.add(new Cake(2, 60, "Chocolate"));
		sugarRush.add(new Cake(4, 160, "Wedding"));
		sugarRush.add(new Cake(1, 10, "Birthday"));
		sugarRush.add(new Cookie(60, "Christmas"));
		sugarRush.add(new Cookie(80, "Sugar"));
		
		// Printing out the menu items
		for (Dessert item : sugarRush) {
			item.bake();
			System.out.println(item);
			item.eat();
			System.out.println("---->");
		}
		

	}

}
