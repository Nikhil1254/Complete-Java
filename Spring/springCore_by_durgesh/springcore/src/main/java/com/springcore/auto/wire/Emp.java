package com.springcore.auto.wire;

public class Emp {
	private Address add;

	// getters and setters
	public Address getAdd() {
		return add;
	}

	public void setAdd(Address address) {
		this.add = address;
		System.out.println("Inside setter");
	}

	// constructors
	public Emp(Address address) {
		super();
		this.add = address;
		System.out.println("Inside constructor");
	}

	public Emp() {
		super();
	}

	@Override
	public String toString() {
		return "Emp [address=" + add + "]";
	}

}
