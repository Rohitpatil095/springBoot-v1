package com.spring.jdbc.repository;

import org.springframework.stereotype.Repository;

import com.spring.jdbc.entity.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class PersonJpa {
	@PersistenceContext
	EntityManager manager;
	
//	public List<Person> getAll(){
//		return manager.get(Person.class);
//	};
}
