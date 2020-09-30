package cst135n.milestone.practice;

// Child of Dessert
public class Cake extends Dessert{
	
	// Class Attributes
	private int numLayers;
	private Slice slice; 			// Composition
	private Frosting frosting;		// Aggregation
	
	// Class Constructor
	Cake(int numLayers, int sugarAmount, String name){
		super(sugarAmount, name);
		this.numLayers = numLayers;
	}

	// Class Getter/Setters
	public int getNumLayers() {
		return numLayers;
	}
	
	public void setSlice(double size) {
		this.slice = new Slice(size);
	}

	public void setNumLayers(int numLayers) {
		this.numLayers = numLayers;
	}
	
	public void setFrosting(Frosting frosting) {
		this.frosting = frosting;
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
