package com.spring.orm;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Application started...");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		StudentDao sd = context.getBean("studentDao", StudentDao.class);

		System.out.println("******** Welcome to spring ORM project ***********");
		Scanner scn = new Scanner(System.in);
		boolean go = true;

		while (go) {

			System.out.println("Press 1 : insert");
			System.out.println("Press 2 : display all");
			System.out.println("Press 3 : get");
			System.out.println("Press 4 : delete");
			System.out.println("Press 5 : update");
			System.out.println("Press 6 : exit");

			int input = Integer.parseInt(scn.nextLine());

			try {
				int id;
				String name;
				String city;

				switch (input) {
				// insert
				case 1:
					System.out.println("*****************************");

					System.out.println("Id : ");
					id = Integer.parseInt(scn.nextLine());
					System.out.println("Name : ");
					name = scn.nextLine();
					System.out.println("City : ");
					city = scn.nextLine();
					sd.insertStudent(new Student(id, name, city));
					System.out.println(id + " added successfully.");
					System.out.println("*********************************");
					break;

				// display all
				case 2:
					System.out.println("*******************************");
					List<Student> list = sd.getStudents();
					for (Student student : list) {
						System.out.println(student);
						System.out.println("----------------------------");
					}
					System.out.println("*******************************");
					break;

				// get single student
				case 3:
					System.out.println("***************************");
					System.out.println("Enter id : ");
					id = Integer.parseInt(scn.nextLine());
					Student student = sd.getStudent(id);
					if (student == null)
						System.out.println("No student found!");
					else
						System.out.println(student);
					System.out.println("*****************************");
					break;

				// delete student
				case 4:
					System.out.println("***************************");
					System.out.println("Enter id : ");
					id = Integer.parseInt(scn.nextLine());
					sd.deleteStudent(id);
					System.out.println("Student deleted successfully.");
					System.out.println("******************************");
					break;

				// update student
				case 5:
					System.out.println("*****************************");

					System.out.println("Id : ");
					id = Integer.parseInt(scn.nextLine());
					System.out.println("Name : ");
					name = scn.nextLine();
					System.out.println("City : ");
					city = scn.nextLine();
					sd.updateStudent(new Student(id, name, city));
					System.out.println("Student updated successfully.");
					System.out.println("**********************************");
					break;

				// exit
				case 6:
					go = false;
					break;

				default:
					System.out.println("Please enter valid option!");
					break;
				}

			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Something went wrong please try again!");
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Thanks for using the application...");
		System.out.println("See you soon!");
	}
}
