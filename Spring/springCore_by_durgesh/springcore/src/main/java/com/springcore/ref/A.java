package com.springcore.ref;

public class A {
	private int x;
	private B obj;

	// getters and setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public B getObj() {
		return obj;
	}

	public void setObj(B obj) {
		this.obj = obj;
	}

	// constructors
	public A(int x, B obj) {
		super();
		this.x = x;
		this.obj = obj;
	}

	public A() {
		super();
	}

	// toString method
	@Override
	public String toString() {
		return "A [x=" + x + ", obj=" + obj + "]";
	}

}
