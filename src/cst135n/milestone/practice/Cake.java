package cst135n.milestone.practice;

// Child of Dessert
public class Cake extends Dessert{
	
	// Class Attributes
	private int numLayers;
	
	// Class Constructor
	Cake(int numLayers, int sugarAmount, String name){
		super(sugarAmount, name);
		this.numLayers = numLayers;
	}

	// Class Getter/Setters
	public int getNumLayers() {
		return numLayers;
	}

	public void setNumLayers(int numLayers) {
		this.numLayers = numLayers;
	}
	
	// Class Methods
	public void decorate() {
		System.out.println("Adding pretty stuff...");
	}

	// Parent Abstract Methods - Concrete Version
	@Override
	public void eat() {
		System.out.print("Eating with a fork... ");
	}
	
	// Common @Override Methods
	public String toString() {		
		return super.getName() + " cake with " + numLayers + " layer(s).";
	}
}
