package com.springcore.auto.wire;

public class Emp {
	private String name;
	private Address add;

	// getters and setters

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address address) {
		this.add = address;
		System.out.println("Inside setter(Address)");
	}

	// constructors
//	public Emp(Address address) {
//		super();
//		this.add = address;
//		System.out.println("Inside constructor with 1 parameter");
//	}

	public Emp() {
		super();
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", add=" + add + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Inside setter of name");
	}

	public Emp(String name, Address add) {
		super();
		this.name = name;
		this.add = add;
		System.out.println("Inside constructor with 2 parameters.");
	}

}
