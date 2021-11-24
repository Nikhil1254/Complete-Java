package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String subject;

	// getters and setters
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		System.out.println("Setting example values");
		this.subject = subject;
	}

	// default constructor
	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	// lifecycle methods
	/*
	 * 2 things do to before using this annotations 1.enable annotation form xml
	 * file .by default they are desabled 2.add dependacy of PostConstruct and
	 * PreDestroy in our project in order to use them
	 */
	@PostConstruct
	public void startMethod() {
		System.out.println("Hello inside init of Example");
	}

	@PreDestroy
	public void endingMethod() {
		System.out.println("Inside destroy of Example");
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}

}
