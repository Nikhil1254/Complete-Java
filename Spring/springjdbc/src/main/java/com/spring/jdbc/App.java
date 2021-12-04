package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		System.out.println("Program started...");

		// using XML based configuration
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext("" +
		 * "com/spring/jdbc/config.xml"); StudentDao dao = context.getBean("studentDao",
		 * StudentDao.class);
		 */

		// using Java and annotation based configuration
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDao dao = context.getBean("studentDao", StudentDao.class);

		// get all students data
		for (Student student : dao.getStudents())
			System.out.println(student);

		/*
		 * getting students which are having same city for (Student student
		 * :dao.getStudentsWithCity("Jamner")) System.out.println(student);
		 */

		/*
		 * getting single student data System.out.println(dao.getStudent(723));
		 */

		/*
		 * deleting student data System.out.println(dao.delete(3) +
		 * " records deleted.");
		 */

		/*
		 * for inserting student System.out.println("Students added : " + dao.insert(new
		 * Student(723, "Manjunath", "Sonala")));
		 * 
		 */

		/*
		 * for updating student data System.out.println(dao.change(new
		 * Student(456,"Vishwajeet", "Kolhapur")) + " rows effected.");
		 * 
		 */
	}
}
