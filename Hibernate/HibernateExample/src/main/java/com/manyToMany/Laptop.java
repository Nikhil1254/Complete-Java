package com.manyToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "laptop_details")
public class Laptop {

	@Id
	private int lid;
	private String brand;

	@ManyToMany(mappedBy = "laptops")
	private List<Student> students;

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Laptop(int lid, String brand, List<Student> students) {
		super();
		this.lid = lid;
		this.brand = brand;
		this.students = students;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + ", students=" + students + "]";
	}

}
