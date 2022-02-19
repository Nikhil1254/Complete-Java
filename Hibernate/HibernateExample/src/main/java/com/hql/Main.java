package com.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("com/hql/hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		// delete query
//		Query q1 = session.createQuery("delete from student_details as s where s.city=:x");
//		q1.setParameter("x", "Pune");
//		System.out.println("Rows effected : " + q1.executeUpdate());

		// update query
		Query q3 = session.createQuery("update student_details as s set s.sname='Ram' where s.city='Bharadi'");
		System.out.println("rows effected : " + q3.executeUpdate());

		tx.commit();
		// select query
		String query = "from student_details";
		Query q = session.createQuery(query);
		List<Student> list = q.list();

		for (Student stud : list)
			System.out.println(stud);

		session.clear();
		factory.close();
	}

}
