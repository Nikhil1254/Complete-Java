package com.objectState;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Application started...");

		Student student = new Student(101, "Nikhil", "Karmad");
		// student is in transient state now - association : DB-no , session-no

		SessionFactory factory = new Configuration().configure("com/objectState/hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		session.save(student);
		// student is in persistent state : association DB:yes , session:yes
		student.setSname("Manjunath"); // value in DB will also change as student is associated with DB
		tx.commit();

		session.close();
		// student is in detached state now : association session:no DB:data saved already
		student.setSname("Ravi");//values in DB will not change as object no associated with session anymore
	}

}
