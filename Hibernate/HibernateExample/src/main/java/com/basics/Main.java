package com.basics;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Application started...");

		Student s1 = new Student(101, "Nikhil", new Address("Karmad", "main road"));
		Student s2 = new Student(102, "Vishwajeet", new Address("Kolhapor", "Pune highway"));
		Student s3 = new Student(103, "Manjunath", new Address("Sonala", "Jamner road"));
		Date date = new Date();
		s1.setDate(date);
		s2.setDate(date);
		s3.setDate(date);

		SessionFactory factory = new Configuration().configure("com/basics/hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		session.save(s1);
		session.save(s2);
		session.save(s3);

		System.out.println(session.load(Student.class, 3));
		tx.commit();
	}

}
