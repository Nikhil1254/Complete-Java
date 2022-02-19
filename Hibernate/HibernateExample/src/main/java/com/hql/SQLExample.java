package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class SQLExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Application started");
		SessionFactory factory = new Configuration().configure("com/hql/hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();

		// firing native quries : SQL queries
		String query = "select * from student_details";
		NativeQuery<Object[]> nq = session.createSQLQuery(query);

		List<Object[]> list = nq.list();

		System.out.println("Studet details are as follows -");
		for (Object[] stud : list)
			System.out.println(Arrays.toString(stud));

		session.close();
		factory.close();
	}

}
