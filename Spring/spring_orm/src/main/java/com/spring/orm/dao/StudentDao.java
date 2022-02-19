package com.spring.orm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entities.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;

	// insert method
	@Transactional
	public int insertStudent(Student student) {
		return (Integer) this.getHibernateTemplate().save(student);
	}

	@Transactional
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);
	}

	@Transactional
	public void deleteStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
	}

	// get single student
	public Student getStudent(int studentId) {
		return this.hibernateTemplate.get(Student.class, studentId);
	}

	// get all students
	public List<Student> getStudents() {
		return this.hibernateTemplate.loadAll(Student.class);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
