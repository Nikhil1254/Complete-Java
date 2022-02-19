package com.manyToMany;

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

		Laptop l1 = new Laptop(201, "Dell", null);
		Laptop l2 = new Laptop(202, "Lenovo", null);
		Laptop l3 = new Laptop(203, "Apple", null);
		Laptop l4 = new Laptop(204, "Hp", null);

		List<Laptop> list1 = new ArrayList<Laptop>();
		list1.add(l1);
		list1.add(l2);
		list1.add(l3);
		List<Laptop> list2 = new ArrayList<Laptop>();
		list2.add(l1);
		list2.add(l3);
		list2.add(l4);

		Student s1 = new Student(101, "Nikhil", null);
		Student s2 = new Student(102, "Manjunath", null);
		s1.setLaptops(list1);
		s2.setLaptops(list2);

		List<Student> slist1 = new ArrayList<Student>();
		List<Student> slist2 = new ArrayList<Student>();
		List<Student> slist3 = new ArrayList<Student>();
		slist1.add(s1);
		slist2.add(s2);
		slist3.add(s1);
		slist3.add(s2);

		l1.setStudents(slist3);
		l2.setStudents(slist1);
		l3.setStudents(slist3);
		l4.setStudents(slist2);

		SessionFactory factory = new Configuration().configure("com/manyToMany/hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		session.save(s1);
		session.save(s2);
		session.save(l1);
		session.save(l2);
		session.save(l3);
		session.save(l4);
		tx.commit();

	}

}
