package com.wipro.automobile.ship;

public class compartment {
	private double height;
	private double width;
	private double breadth;
	
	public compartment(double d, double f, double e) {
		this.height = d;
		this.width = f;
		this.breadth = e;
	}

	@Override
	public String toString() {
		return "Compartment Details: "
				+ "\n height=" + height + "\n width=" + width + 
				"\n breadth=" + breadth ;
	}
}