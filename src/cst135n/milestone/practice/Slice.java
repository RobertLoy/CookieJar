package cst135n.milestone.practice;

import java.io.Serializable;

public class Slice implements Serializable {

	// Normally these object would have more than one
	// attribute, otherwise they could just be attributes in
	// the Cake class.  Doing this to keep it simple.
	
	private double size;      // percentage of 360 degrees

	Slice(double size){
		this.size = size;
	}
	
	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}
}
