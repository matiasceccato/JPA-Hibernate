package com.in28minutes.springboot.jpaandhibernate.course.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.springboot.jpaandhibernate.course.Course;
import java.util.List;


public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long>{
    List<Course> findByAuthor(String author);
    List<Course> findByName(String name);
}
