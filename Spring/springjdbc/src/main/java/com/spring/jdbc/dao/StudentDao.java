package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entities.Student;

public interface StudentDao {
	// for inserting data
	int insert(Student student);

	// for changing existing data
	int change(Student student);

	// delete student
	int delete(int id);

	// get single student data
	Student getStudent(int id);

	// get multiple students having same city
	List<Student> getStudentsWithCity(String city);

	//get all students
	List<Student> getStudents();
}
