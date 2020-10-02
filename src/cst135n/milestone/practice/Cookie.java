package cst135n.milestone.practice;

import java.io.Serializable;

//Child of Dessert
public class Cookie extends Dessert implements Serializable{
	
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
	
	// Special printout used for menu
	@Override
	public String toMenuString() {		
		return super.getName() + " cookie with " + mixIn;
	}

	// Common @Override Methods
	@Override
	public String toString() {
		return "Cookie [mixIn=" + mixIn + ", getMixIn()=" + getMixIn() + ", toMenuString()=" + toMenuString()
				+ ", getSugarAmount()=" + getSugarAmount() + ", getName()=" + getName() + "]";
	}

}
