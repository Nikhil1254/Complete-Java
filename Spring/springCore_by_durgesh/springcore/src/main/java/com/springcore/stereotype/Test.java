package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		MyStudent student1 = (MyStudent) context.getBean("student", MyStudent.class);
		MyStudent student2 = (MyStudent) context.getBean("student", MyStudent.class);

		System.out.println("learing about @Component and @Value(with collections also)");
		System.out.println(student1);
		System.out.println(student2.getFriends());
		System.out.println("-------------------------------------------");
		// scope of bean using annotations -
		System.out.println("Singleton scope(same object is used everytime)");
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println("---------------------------------------------");
		// scope of bean using xml configuration
		Teacher t1 = (Teacher) context.getBean("teacher", Teacher.class);
		Teacher t2 = (Teacher) context.getBean("teacher", Teacher.class);

		System.out.println("prototype scope(2 different objects get created)");
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());

	}

}
