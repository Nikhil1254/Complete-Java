package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Student {

	@Autowired
	private Samosa samosa;

	public void study() {
		this.samosa.display();
		System.out.println("Student is reading");
	}
}
