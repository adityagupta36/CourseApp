package com.aditya.projects.CourseApp.controller;

import com.aditya.projects.CourseApp.CourseService.CourseServiceImpl;
import com.aditya.projects.CourseApp.entitiy.Course;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    CourseServiceImpl service;

    @GetMapping("/home")
    public String greet(){
        return "Hello";
    }


    @GetMapping("/courses")
    public List<Course> getCourses(){
      return service.getCourses();
    }

    @GetMapping("/course/{id}")
    public Course getCourse(@PathVariable Long id){
        return service.getCourse(id);
    }


    @PostMapping("/addCourse")
    public Course addCourse(@RequestBody Course course){
        return service.addCourse(course);
    }


    @PutMapping("/update/{id}")
    public Course updateCourse(@RequestBody Course course, @PathVariable Long id){
        return service.updateCourse(course,id);
    }



    @DeleteMapping("/delete/{id}")
    public void deleteCourse(@PathVariable Long id) {
        service.deleteCourse(id);

    }
    }
