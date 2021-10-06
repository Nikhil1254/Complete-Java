package com.practice.learning_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AppDemo {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AppDemo.class, args);
		
		// Alien obj = context.getBean(Alien.class);
		// obj.show();
		// Alien obj1 = context.getBean(Alien.class);
		// obj1.show();
	}

}
