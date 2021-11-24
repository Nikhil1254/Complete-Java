package com.springcore.auto.wire;

public class Emp {
	private Address address;

	// getters and setters
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Inside setter");
	}

	// constructors
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside constructor");
	}

	public Emp() {
		super();
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
