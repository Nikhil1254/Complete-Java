package com.springrest.springrest.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    // get all courses
    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseService.getCourses();
    }

    // get single course
    @GetMapping("/courses/{courseId}")
    public String getCourse(@PathVariable long courseId) {
        return this.courseService.getCourse(courseId);
    }

    // add new Course
    @PostMapping("/courses")
    public String addCourse(@RequestBody Course course) {
        return this.courseService.addCourse(course);
    }

    // update course
    @PutMapping("/courses")
    public String updateCourse(@RequestBody Course course) {
        return this.courseService.updateCourse(course);
    }

    // delete course with given id
    @DeleteMapping("/courses/{courseId}")
    public String deleteCourse(@PathVariable long courseId) {
        return this.courseService.deleteCourse(courseId);
    }
}
