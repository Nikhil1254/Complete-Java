package com.springrest.springrest.dao;

import com.springrest.springrest.entities.Course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends JpaRepository<Course, Long> {

}
