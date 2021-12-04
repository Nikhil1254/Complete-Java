package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	// setting normal values
	@Value("#{10>20 ? 50 : 100}")
	private int num1;
	@Value("#{20+30}")
	private int num2;

	// calling static methods - T(class).method(parameters)
	@Value("#{ T(java.lang.Math).sqrt(25) }")
	private double num3;

	// using static variables - T(class).variable
	@Value("#{T(java.lang.Math).PI}")
	private double num4;

	// creating objects new Constructor(parameters if any)
	@Value("#{ new String('Nikhil')}")
	private String name;

	// boolean value with spel
	@Value("#{ 8<9 }")
	private boolean isActive;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public double getNum3() {
		return num3;
	}

	public void setNum3(double num3) {
		this.num3 = num3;
	}

	public double getNum4() {
		return num4;
	}

	public void setNum4(double num4) {
		this.num4 = num4;
	}

	@Override
	public String toString() {
		return "Demo [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + ", num4=" + num4 + ", name=" + name
				+ ", isActive=" + isActive + "]";
	}

}
