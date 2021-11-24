package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
	private double price;

	// getters and setters
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting pepsi price");
		this.price = price;
	}

	// default constructor
	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	// afterPropertySet means init cha kam karel he
	// signature same ahe yanni nav vegla thevlay tyacha
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside init of pepsi");
	}

	// detroy method of Displosablebean inerface
	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy of pepsi");

	}

	//

}
