package com.spring.app.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.app.entity.Student;

public interface StudentsRepository extends CrudRepository<Student,Long> {
	
//	public List<Student> findByName();
}
