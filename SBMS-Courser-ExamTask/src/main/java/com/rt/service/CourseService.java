package com.rt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.entity.Course;
import com.rt.repository.CourseRepository;

@Service
public class CourseService {
	@Autowired
	private CourseRepository repository;
	
	 public Course addCourse(Course course) {
		return repository.save(course);
	 }
	 
	 public Course getById(Long id) {
		 return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Course Not Found"));
	 }
	 
	 public List<Course> getAllCourses(){
		 return repository.findAll();
	 }
	 
	 public Course updateCourse(Long id, Course course) {
		 Course existCourse = getById(id);
		 existCourse.setName(course.getName());
		 existCourse.setPrice(course.getPrice());
		 return existCourse;
	 }
	 
	 public String deleteById(Long id) {
		 Course course = getById(id);
		 repository.delete(course);
		 return "Course deleted :"+id;
	 }
	
}
