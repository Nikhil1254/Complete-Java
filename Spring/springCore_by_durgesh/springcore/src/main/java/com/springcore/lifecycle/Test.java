package com.springcore.lifecycle;

import java.awt.Container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/lifeCycleConfig.xml");

//		 way1 of implementing lifecycle methods - through XML

		Samosa s1 = (Samosa) context.getBean("s1");
		System.out.println(s1);
		System.out.println("++++++++++++++++++++++++++++++++++++");

//		 way2 of implementing lifecycle methods - through InitializingBean,DisposableBean
		Pepsi p1 = (Pepsi) context.getBean("p1");
		System.out.println(p1);

//		way3 of implementing lifecycle methods using annotation
		Example example = (Example)context.getBean("example");
		System.out.println(example);
		
		
		
		context.registerShutdownHook(); // we have to write this for all ways to run destroy lifecycle method

	}
}
