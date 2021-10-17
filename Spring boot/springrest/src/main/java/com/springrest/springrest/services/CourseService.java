package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Course;

public interface CourseService {
    public List<Course> getCourses();

    public String getCourse(long courseId);

    public String addCourse(Course course);

    public String updateCourse(Course course);

    public String deleteCourse(long courseId);
}
