package com.rt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rt.entity.Course;
import com.rt.service.CourseService;

@RestController
public class CourseController {
	@Autowired
	private CourseService courseService;
	
	@PostMapping("/save")
	public ResponseEntity<Course> addCourse(@RequestBody Course course){
		Course course2 = courseService.addCourse(course);
		return new ResponseEntity<Course>(course2, HttpStatus.CREATED);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<Course> getById(@PathVariable Long id){
		Course course = courseService.getById(id);
		return new ResponseEntity<Course>(course, HttpStatus.OK);
	}
	
	@GetMapping("/find")
	public ResponseEntity<List<Course>> getAllCourses(){
		List<Course> allCourses = courseService.getAllCourses();
		return new ResponseEntity<List<Course>>(allCourses, HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Course> updateCourse(@PathVariable Long id, @RequestBody Course course){
		Course updateCourse = courseService.updateCourse(id, course);
		return new ResponseEntity<Course>(updateCourse, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteCourse(@PathVariable Long id){
		String msg = courseService.deleteById(id);
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}
}
