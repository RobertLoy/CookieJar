package cst135n.milestone.practice;

//Child of Dessert
public class Cookie extends Dessert {
	
	// Class Attributes
	private String mixIn;

	// Class Constructor
	Cookie(int sugarAmount, String name){
		super(sugarAmount, name);
	}
	
	// Class Getter/Setters
	public String getMixIn() {
		return mixIn;
	}

	public void setMixIn(String mixIn) {
		this.mixIn = mixIn;
	}
	
	// Class Methods
	public void putInJar() {
		System.out.println("Storing...");
	}

	// Parent Abstract Methods - Concrete Version
	@Override
	public void eat() {
		System.out.print("Eating with fingers... ");
		
	}
	
	// Common @Override Methods
	public String toString() {		
		return super.getName() + " cookie with " + mixIn;
	}

}
