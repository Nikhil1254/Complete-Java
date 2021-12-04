package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/standalone/collections/aloneconfig.xml");

		Person p1 = context.getBean("person1", Person.class);

		System.out.println(p1);
		System.out.println("Implementation class of List(interface) - " + p1.getFriends().getClass().getName());
		System.out.println("Implementation class of Map(interface) - " + p1.getFeeStructure().getClass().getName());
		System.out.println(p1.getProperties().getClass().getName());
	}

}
