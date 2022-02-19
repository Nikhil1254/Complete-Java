package com.springcore.auto.wire;

public class Address1 {
	private String street;
	private String city;

	// getters and setters
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	// constructor
	public Address1() {
		super();
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
}
