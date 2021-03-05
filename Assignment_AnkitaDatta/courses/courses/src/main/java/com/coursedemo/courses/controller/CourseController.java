package com.coursedemo.courses.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coursedemo.courses.entity.Course;
import com.coursedemo.courses.service.CourseService;


@RestController
@RequestMapping("/api/course")
public class CourseController {
	
	private CourseService courseService;
	
	@Autowired
	public CourseController(CourseService courseService1) {
		courseService = courseService1;
	}
	
	@GetMapping("/allCourses")
	public List<Course> allCourses() {
		return courseService.findAll();
	}
	
}
