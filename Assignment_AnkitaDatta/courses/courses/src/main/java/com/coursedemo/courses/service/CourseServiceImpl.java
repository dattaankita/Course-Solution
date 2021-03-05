package com.coursedemo.courses.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.exception.SQLGrammarException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coursedemo.courses.entity.Course;
import com.coursedemo.courses.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService{
	
	private CourseRepository courseRepository;
	
	@Autowired
	public CourseServiceImpl( CourseRepository theCourseRepository) {
		courseRepository = theCourseRepository;
	}

	@Override
	public List<Course> findAll() {
		
		List<Course> courses=courseRepository.findAll();
		if(courses == null)
			throw new RuntimeException("Did not find password");
		return courses;

	}

}
