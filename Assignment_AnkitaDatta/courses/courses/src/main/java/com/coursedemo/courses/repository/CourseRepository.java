package com.coursedemo.courses.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coursedemo.courses.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {


}
