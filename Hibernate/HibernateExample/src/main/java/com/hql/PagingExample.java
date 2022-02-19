package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class PagingExample {

	public static void main(String[] args) {
		System.out.println("Application started");
		SessionFactory factory = new Configuration().configure("com/hql/hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();

		Query<Student> query = session.createQuery("from student_details", Student.class);

		// paging implementation
		query.setFirstResult(4);
		query.setMaxResults(5);

		List<Student> list = query.list();

		for (Student student : list)
			System.out.println(student);

		session.close();
		factory.close();

	}

}
