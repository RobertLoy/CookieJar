package cst135n.milestone.practice;

import java.io.Serializable;

public class Frosting implements Serializable {
	
	// Normally these object would have more than one
	// attribute, otherwise they could just ne attributes in
	// the Cake class.  Doing this to keep it simple.
	private String base;
	
	Frosting(String base){
		this.base = base;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

}
