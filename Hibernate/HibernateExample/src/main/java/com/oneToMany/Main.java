package com.oneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l1 = new Laptop(101, "Dell");
		Laptop l2 = new Laptop(102, "Lenovo");
		Laptop l3 = new Laptop(103, "Apple");
		Laptop l4 = new Laptop(104, "HP");

		List<Laptop> list1 = new ArrayList<Laptop>();
		List<Laptop> list2 = new ArrayList<Laptop>();
		list1.add(l1);
		list1.add(l3);
		list2.add(l2);
		list2.add(l4);

		Student s1 = new Student(101, "Nikhil", "Karmad", list1);
		Student s2 = new Student(102, "Manjunath", "Sonala", list2);

		SessionFactory factory = new Configuration().configure("com/oneToMany/hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		session.save(l1);
		session.save(l2);
		session.save(l3);
		session.save(l4);
		session.save(s1);
		session.save(s2);

		System.out.println(session.load(Student.class, 101));
		System.out.println(session.load(Student.class, 102));
		tx.commit();
	}

}
