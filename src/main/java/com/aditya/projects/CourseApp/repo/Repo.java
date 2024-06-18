package com.aditya.projects.CourseApp.repo;

import com.aditya.projects.CourseApp.entitiy.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Course, Long> {
}
