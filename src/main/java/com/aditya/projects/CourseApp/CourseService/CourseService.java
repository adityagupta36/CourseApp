package com.aditya.projects.CourseApp.CourseService;

import com.aditya.projects.CourseApp.entitiy.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCourses();


    Course getCourse(Long id);

    Course addCourse(Course course);


    Course updateCourse(Course course, Long id);

    void deleteCourse(Long id);
}
