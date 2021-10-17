package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    // private List<Course> list;
    @Autowired
    private CourseDao courseDao;

    public CourseServiceImpl() {
        // this.list = new ArrayList<>();
        // this.list.add(new Course(173, "Java course", "You will learn core java in
        // this course"));
        // this.list.add(new Course(512, "spring boot", "You will be creating REST API
        // using spring boot"));
    }

    @Override
    public List<Course> getCourses() {
        // return this.list;
        return courseDao.findAll();
    }

    @Override
    public String getCourse(long courseId) {
        // Course c = null;

        // for (Course course : this.list) {
        // if (course.getId() == courseId) {
        // c = course;
        // break;
        // }
        // }
        // return c;

        if (courseDao.existsById(courseId))
            return courseDao.getById(courseId).toString();
        else
            return "No course with given ID found.";
    }

    @Override
    public String addCourse(Course course) {
        // boolean flag = false;
        // for (Course c : this.list)
        // if (c.getId() == course.getId()) {
        // flag = true;
        // break;
        // }

        // if (!flag) {
        // this.list.add(course);
        // return "Course has been added successfully.";
        // } else
        // return "A course with same courseId already exists,cannot add this course!";
        for (Course c : courseDao.findAll())
            if (c.getId() == course.getId())
                return "Course with same courseId already exists!";

        courseDao.save(course);
        return "Course has been added successfully.";
    }

    @Override
    public String updateCourse(Course course) {
        // boolean flag = false;
        // for (Course c : this.list)
        // if (c.getId() == course.getId()) {
        // c.setTitle(course.getTitle());
        // c.setDescription(course.getDescription());
        // flag = true;
        // break;
        // }

        // if (flag)
        // return "Course has been updated.";
        // else
        // return "No course with given id found!";
        courseDao.save(course);
        return "Course has been updated successfully.";
    }

    @Override
    public String deleteCourse(long courseId) {
        // boolean flag = false;
        // int idx = 0;
        // for (Course course : this.list) {
        // if (course.getId() == courseId) {
        // this.swap(idx, this.list.size() - 1);
        // this.list.remove(this.list.size() - 1);
        // flag = true;
        // break;
        // }
        // idx++;
        // }

        // if (flag)
        // return "Course has been deleted successfully.";
        // else
        // return "No course found with given courseId.";

        for (Course course : courseDao.findAll())
            if (course.getId() == courseId) {
                courseDao.deleteById(courseId);
                return "Course has been deleted successfully.";
            }

        return "Course with given id not found!";

    }

    // private void swap(int i, int j) {
    // Course course = this.list.get(i);
    // this.list.set(i, this.list.get(j));
    // this.list.set(j, course);
    // }

}
