package com.spring.app.repoTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.app.entity.Student;
import com.spring.app.repo.StudentsRepository;


public class StudentRepoTest {

	@Autowired
	StudentsRepository srepo;
	
	@Test
	public void test() {
		Student s =new Student("some","sut",243);
		srepo.save(s);
		
		// check is entity saved or not 
//		srepo.findById(1)
//		if()
//		{
//			
//		}
//		else
//		{
//			fail();
//		}
	}

}
