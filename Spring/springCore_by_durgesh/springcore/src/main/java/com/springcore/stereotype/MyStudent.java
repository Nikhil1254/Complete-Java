package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("student")
@Scope("singleton")
public class MyStudent {
	@Value("Nikhil")
	private String name;
	@Value("Jalgaon")
	private String city;
	@Value("#{myFriends}") // inserting standalone list using @Value annotation
	private List<String> friends;

	// getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("name setter");
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println("City setter");
		this.city = city;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		System.out.println("Friends setter");
		this.friends = friends;
	}

	// toString method
	@Override
	public String toString() {
		return "MyStudent [name=" + name + ", city=" + city + "]";
	}

}

/*
 * 1).we have learnt how to use @Component and we can also specify the variable
 * name - @Component("variableName") we want . 2).we also learnt about @Value
 * annotation for injecting values 3).we have also learnt , how to inject
 * collections using @Value annotation
 */
