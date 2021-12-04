package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	// we can use here @Autowired
	@Autowired
	@Qualifier("address2")
	private Address address;

	// getters and setters
	public Address getAdd() {
		return address;
	}

	// We can use it with setter also i. here @Autowired
	public void setAdd(Address address) {
		this.address = address;
		System.out.println("Inside setter");
	}

	// constructors
	// we can use it here also i.e with constructor
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
