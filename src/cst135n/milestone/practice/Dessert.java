package cst135n.milestone.practice;

//Parent of Cookie and Cake 
// Abstract so you CANNOT make an object of Dessert
public abstract class Dessert {

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

}
