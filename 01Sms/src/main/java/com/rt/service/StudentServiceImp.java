package com.rt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.entity.Student;
import com.rt.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService{

	@Autowired
	private StudentRepository repository;
	@Override
	public List<Student> getAllStudent() {
		List<Student> all = repository.findAll();
		return all;
		
	}

	@Override
	public Student saveStudent(Student student) {
		Student save = repository.save(student);
		return save;
		
	}

	@Override
	public void deleteStudent(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public Student patchUpdate(Integer id, Student student) {
		
		Student existStudent = repository.findById(id)
				 .orElseThrow(() -> new RuntimeException("Student not found"));
		
		if(student.getName() != null) {
			existStudent.setName(student.getName());
		}
		
		if(student.getMarks() != null) {
			existStudent.setMarks(student.getMarks());
		}
		return repository.save(existStudent);
	}

}
