package com.cascading;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l1 = new Laptop(201, "Dell", null);
		Laptop l2 = new Laptop(202, "Lenovo", null);
		Laptop l3 = new Laptop(203, "HP", null);
		List<Laptop> list = new ArrayList<Laptop>();
		list.add(l1);
		list.add(l2);
		list.add(l3);

		Student student = new Student(101, "Nikhil", list);
		l1.setStudent(student);
		l2.setStudent(student);
		l3.setStudent(student);

		SessionFactory factory = new Configuration().configure("com/cascading/hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		session.save(student);
//		session.remove(student);
		tx.commit();

		session.close();
		factory.close();

	}

}
