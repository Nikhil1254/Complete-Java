package com.manyToOne;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {

	@Id
	private int sid;
	private String name;
	@OneToMany(mappedBy = "student", fetch = FetchType.LAZY)
	private List<Laptop> laptops;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Laptop> getLaptops() {
		return laptops;
	}

	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}

	public Student(int sid, String name, List<Laptop> laptops) {
		super();
		this.sid = sid;
		this.name = name;
		this.laptops = laptops;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [sid=" + this.sid + ", name=" + this.name + ", laptops=" + this.laptops + "]";
	}

}
