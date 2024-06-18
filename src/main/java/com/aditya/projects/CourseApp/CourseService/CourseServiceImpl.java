package com.aditya.projects.CourseApp.CourseService;

import com.aditya.projects.CourseApp.entitiy.Course;
import com.aditya.projects.CourseApp.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    Repo repo;

    @Override
    public List<Course> getCourses() {
       List<Course> course = repo.findAll();
        return course;
    }



    @Override
    public Course getCourse(Long id){
        Course course = repo.findById(id).orElseThrow(()->new RuntimeException("Course Not Found"));
        return course;
    }

    @Override
    public Course addCourse(Course course) {
       return repo.save(course);
    }




    @Override
    public Course updateCourse(Course course1, Long id) {
       Course course =  repo.findById(id).orElseThrow(()->new RuntimeException("Course Not Found"));
       course.setTitle(course1.getTitle());
       course.setDescription(course1.getDescription());
        return repo.save(course);
    }

    @Override
    public void deleteCourse(Long id) {
        Course course =  repo.findById(id).orElseThrow(()->new RuntimeException("Course Not Found"));
        repo.delete(course);

    }


}
