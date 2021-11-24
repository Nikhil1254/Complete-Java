package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
		Emp emp = context.getBean("emp", Emp.class); // we can also use this syntax instead of type casting
		System.out.println(emp);
	}

}
