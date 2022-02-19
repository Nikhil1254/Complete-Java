package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entities.Student;

public interface StudentDao {
	// inserting data
	int insert(Student student);

	// updating data
	int change(Student student);

	// delete data
	int delete(int id);

	// get single student data
	Student getStudent(int id);

	// get multiple students having same city
	List<Student> getStudentsWithCity(String city);

	//get all students
	List<Student> getStudents();
}
