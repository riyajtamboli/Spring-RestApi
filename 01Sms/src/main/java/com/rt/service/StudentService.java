package com.rt.service;

import java.util.List;

import com.rt.entity.Student;

public interface StudentService {
		
	List<Student> getAllStudent();
	Student saveStudent(Student student);
	void deleteStudent(Integer id);
	Student patchUpdate(Integer id, Student student);
}
