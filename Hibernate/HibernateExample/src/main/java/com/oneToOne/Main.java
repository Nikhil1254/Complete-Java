package com.oneToOne;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Application started...");

		Address address = new Address("Karmad", "main road");
		Student s1 = new Student("Nikhil", address, new Date()); // 1.transient state

		SessionFactory factory = new Configuration().configure("com/oneToOne/hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		session.save(address);
		session.save(s1); // 2.persistan state
		s1.setName("Rajesh");
		s1.setName("Manjunath");
		// session.delete(s1); remove state
		tx.commit();

		session.close(); // detached state 

	}

}
