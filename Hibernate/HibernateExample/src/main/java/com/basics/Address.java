package com.basics;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String city;
	private String road;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRoad() {
		return road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	public Address(String city, String road) {
		super();
		this.city = city;
		this.road = road;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", road=" + road + "]";
	}

}
