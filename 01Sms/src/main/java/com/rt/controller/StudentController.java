package com.rt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rt.entity.Student;
import com.rt.service.StudentServiceImp;

@RestController
@RequestMapping("student")
public class StudentController {
	
		@Autowired
		private StudentServiceImp imp;
		private Student patchUpdate;
	
		@GetMapping("/getAllStudent")
		public ResponseEntity<List<Student>> getStudent(){
			List<Student> allStudent = imp.getAllStudent();
			return ResponseEntity.ok(allStudent);	
		}
		
		
		@PostMapping("/save")
		public ResponseEntity<Student> saveStudent(@RequestBody Student student){
			Student stu = imp.saveStudent(student);
			return ResponseEntity.ok(stu);
		}
		
		@DeleteMapping("/delete")
		public ResponseEntity<String> deleteStudent(@RequestParam Integer id){
			imp.deleteStudent(id);
			return ResponseEntity.ok("Student Delete SuccessFully");
		}	
		
		
		@PatchMapping("/update/{id}")
		public ResponseEntity<Student> update(@PathVariable Integer id, @RequestBody Student student){
		 Student patchStudent = imp.patchUpdate(id, student);
		 	
			return ResponseEntity.ok(patchStudent);
			
		}
	
}
