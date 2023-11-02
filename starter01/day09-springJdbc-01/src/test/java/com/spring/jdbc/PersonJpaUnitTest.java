package com.spring.jdbc;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;

import com.spring.jdbc.repository.PersonJpa;

import jakarta.transaction.Transactional;

@Transactional
public class PersonJpaUnitTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	@Autowired
	PersonJpa jpa;
	
	@Test
	@DirtiesContext
	public void testdeleteById()
	{
		assertEquals(null,jpa.getById(2));
	}
}
