package com.rt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rt.entity.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
