package com.manyToOne;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Application started...");

		Student student = new Student(101, "Nikhil", null);
		Laptop l1 = new Laptop(201, "Dell", student);
		Laptop l2 = new Laptop(202, "Lenovo", student);
		Laptop l3 = new Laptop(203, "HP", student);

		List<Laptop> list = new ArrayList<Laptop>();
		list.add(l1);
		list.add(l2);
		list.add(l3);
		student.setLaptops(list);

		Configuration cfg = new Configuration();
		cfg.configure("com/manyToOne/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
//		session.save(l1);
//		session.save(l2);
//		session.save(l3);
//		session.save(student);
		tx.commit();

		// LAZY and EAGER loading -
		Student stud = session.get(Student.class, 101);
		System.out.println(stud);
	}

}
