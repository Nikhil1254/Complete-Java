package com.springcore.ref;

public class B {
	private int y;

	// getters and setters
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// constructors -
	public B(int y) {
		super();
		this.y = y;
	}

	public B() {
		super();
	}

	// toString method
	@Override
	public String toString() {
		return "B [y=" + y + "]";
	}

}
