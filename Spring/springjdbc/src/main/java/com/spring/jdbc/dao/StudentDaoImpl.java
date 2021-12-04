package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entities.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	// getters setters
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// Insert
	public int insert(Student student) {
		String query = "insert into student(id,name,city) values(?,?,?)";
		return this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
	}

	// Update
	public int change(Student student) {
		// query
		String query = "update student set name=? , city=? where id=?";
		// execute query
		return this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
	}

	// Delete
	public int delete(int id) {
		String query = "delete from student where id=?";
		return this.jdbcTemplate.update(query, id);
	}

	// GetSingleRow
	public Student getStudent(int id) {
		String query = "select * from student where id=?";
		return this.jdbcTemplate.queryForObject(query, new RowMapperImpl(), id);
	}

	// get students having same city
	public List<Student> getStudentsWithCity(String city) {
		String query = "select * from student where city=?";
		return this.jdbcTemplate.query(query, new RowMapperImpl(), city);
	}

	public List<Student> getStudents() {
		String query = "select * from student";
		return this.jdbcTemplate.query(query, new RowMapperImpl());
	}

}
