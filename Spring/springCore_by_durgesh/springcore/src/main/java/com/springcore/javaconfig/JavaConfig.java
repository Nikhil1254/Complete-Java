package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}

	@Bean(name = { "student", "temp", "obj" })
	public Student getStudent() {
		// creating Student class object
		Student student = new Student();
		return student;
	}
}
