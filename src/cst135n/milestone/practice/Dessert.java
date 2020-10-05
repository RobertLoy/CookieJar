package cst135n.milestone.practice;

import java.io.Serializable;
import java.util.Comparator;

//Parent of Cookie and Cake 
// Abstract so you CANNOT make an object of Dessert
public abstract class Dessert implements Serializable {

	// Class Attributes
	private int sugarAmount = 0;
	private String name;
	
	// Class Constructor
	Dessert(int sugarAmount, String name){
		this.sugarAmount = sugarAmount;
		this.name = name;
	}

	// Class Getter/Setters
	public int getSugarAmount() {
		return sugarAmount;
	}

	public void setSugarAmount(int sugarAmount) {
		this.sugarAmount = sugarAmount;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// Class Methods
	public void bake() {
		System.out.println("Baking...");
	}
	
	// Parent Abstract Methods - Abstract Version
	public abstract void eat();
	public abstract String toMenuString();
	
    public static Comparator<Dessert> nameComparator = new Comparator<Dessert>() {

	public int compare(Dessert s1, Dessert s2) {
	   String dessert1 = s1.getName().toUpperCase();
	   String dessert2 = s2.getName().toUpperCase();

	   //ascending order
	   return dessert1.compareTo(dessert2);

    }};

}
