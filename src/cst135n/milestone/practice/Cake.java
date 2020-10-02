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

	// Special printout used for menu
	@Override
	public String toMenuString() {
		return super.getName() + " cake with " + numLayers + " layer(s).";		
	}
	
	// Common @Override Methods
	@Override
	public String toString() {
		return "Cake [numLayers=" + numLayers + ", slice=" + slice + ", frosting=" + frosting + ", getSugarAmount()="
				+ getSugarAmount() + ", getName()=" + getName() + "]";
	}
}
