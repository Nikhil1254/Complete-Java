package com.oneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {

	@Id
	private int id;
	private String name;
	private String city;

	// one student can have many laptops
	@OneToMany
	private List<Laptop> laptops;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Laptop> getLaptop() {
		return laptops;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptops = laptop;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String city, List<Laptop> laptops) {
		// TODO Auto-generated constructor stub
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.laptops = laptops;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", laptop=" + laptops + "]";
	}

}
