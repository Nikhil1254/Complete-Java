package com.springcore.spel;

import org.springframework.expression.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
		Demo demo = context.getBean("demo", Demo.class);
		System.out.println(demo);

		// mostly spel is used with @Value annotation
		// another way of processing spel expression using apel Api
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression exp = temp.parseExpression("10<20 ? 120 : 220");
		System.out.println(exp.getValue());
	}

}
