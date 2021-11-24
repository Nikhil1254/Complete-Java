package com.springcore.contructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/contructorInjection/ciconfig.xml");

		Person person1 = (Person) context.getBean("person1");
		Person person2 = (Person) context.getBean("person2");
		Person person3 = (Person) context.getBean("person3");
		System.out.println("-------------------------------------------");
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		System.out.println(person3.getList());
		System.out.println("--------------------------------------------");

		// learning about ambiquity problem
		Addition add = (Addition) context.getBean("add");
		add.doSum();
	}

}
