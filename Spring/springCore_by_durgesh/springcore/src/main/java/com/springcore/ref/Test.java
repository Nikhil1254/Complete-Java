package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		A aref = (A) context.getBean("aref");
		A aref1 = (A) context.getBean("aref1");

		System.out.println(aref);
		System.out.println(aref1);

	}

}
