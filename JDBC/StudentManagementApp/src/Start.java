import java.util.Scanner;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args) {
		System.out.println("Welcome to student management application.");
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("Enter you choice -> ");
			System.out.println("PRESS 1 to ADD student");
			System.out.println("PRESS 2 to DELETE student");
			System.out.println("PRESS 3 to DISPLAY student");
			System.out.println("PRESS 4 to EXIT app");

			int choice = Integer.parseInt(scn.nextLine());

			if (choice == 1) {
				// add student
				System.out.println("Enter student name :");
				String name = scn.nextLine();
				System.out.println("Enter Student phone");
				String phone = scn.nextLine();
				System.out.println("Enter student city");
				String city = scn.nextLine();

				Student student = new Student(name, phone, city);
				boolean flag = StudentDao.insertStudentToDB(student);
				if (flag)
					System.out.println("Student added successfully.");
				else
					System.out.println("Something went wrong try again latter!!!");
			} else if (choice == 2) {
				// delete student
				System.out.println("Enter student id to be deleted :");
				int sid = Integer.parseInt(scn.nextLine());
				boolean flag = StudentDao.deleteStudent(sid);
				if (flag)
					System.out.println("Student deleted....");
				else
					System.out.println("Something went wrong try again!");
			} else if (choice == 3) {
				// display all students
				StudentDao.displayAll();
			} else if (choice == 4) {
				// exiting program
				break;
			} else {
				System.out.println("Invalid choice!!!");
			}
		}

		System.out.println("thank you for using application see you soon!!!");
		System.out.println("Bbye!");
	}

}
