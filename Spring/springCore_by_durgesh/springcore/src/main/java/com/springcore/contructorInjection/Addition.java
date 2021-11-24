package com.springcore.contructorInjection;

public class Addition {
	private int num1;
	private int num2;

	public Addition(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("Constructor of Addition : int,int");
	}

	public Addition(double num1, double num2) {
		this.num1 = (int) num1;
		this.num2 = (int) num2;
		System.out.println("Constructor of Addition : double,double");
	}

	public Addition(String num1, String num2) {
		this.num1 = Integer.parseInt(num1);
		this.num2 = Integer.parseInt(num2);
		System.out.println("Constructor of Addition : String,String");
	}

	public void doSum() {
		System.out.println("value of num1 :" + this.num1);
		System.out.println("Value of num2 :" + this.num2);
		System.out.println("Sum is " + (num1 + num2));
	}
}
