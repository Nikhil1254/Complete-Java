package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("Config.xml"); Student student1 = (Student)
		 * context.getBean("student1"); Student student2 = (Student)
		 * context.getBean("student2"); Student student3 = (Student)
		 * context.getBean("student3"); System.out.println(student1);
		 * System.out.println(student2); System.out.println(student3);
		 */

		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		// me bean get nahi keliye tari IOC container ne tya banavlya astil
		/*
		 * jevde pn beans apan declare karto IOC container tyanchya dependanies resolve
		 * karun yanche objects create karun memory madhe store karun thevta ani jevha
		 * jevha lagel tevha te objects proide karta.
		 * 
		 */

		System.out.println("Object is created only once(scope=singleton(default))");
		Student s1 = context.getBean("student1", Student.class);
		Student s2 = context.getBean("student1", Student.class);
		Student s3 = context.getBean("student1", Student.class);

		System.out.println("s1 : " + s1.hashCode());
		System.out.println("s2 : " + s2.hashCode());
		System.out.println("s3 : " + s3.hashCode());

	}
}
