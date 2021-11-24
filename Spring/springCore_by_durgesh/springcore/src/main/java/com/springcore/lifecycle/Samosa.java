package com.springcore.lifecycle;

public class Samosa {
	private double price;

	// getters setters
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting samosa price");
		this.price = price;
	}

	// default constructor
	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	// life cycle methods
	public void hey() {
		System.out.println("inside init of Samosa.");
	}

	public void bye() {
		System.out.println("inside destroy of Samosa.");
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

}
