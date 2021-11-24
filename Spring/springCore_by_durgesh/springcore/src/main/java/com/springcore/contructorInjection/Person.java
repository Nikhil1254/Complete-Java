package com.springcore.contructorInjection;

import java.util.List;

public class Person {
	private int id;
	private String name;
	private Certi certi;
	private List<String> list;

	public Person(int id, String name, Certi certi, List<String> list) {
		super();
		System.out.println("Running constructor of Person");
		this.id = id;
		this.name = name;
		this.certi = certi;
		this.list = list;
	}

	public List<String> getList() {
		return this.list;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", certi=" + certi + ", list=" + list + "]";
	}

}
