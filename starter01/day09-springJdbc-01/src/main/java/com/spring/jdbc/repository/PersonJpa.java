package com.spring.jdbc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.jdbc.entity.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PersonJpa {
	@Autowired
	@PersistenceContext
	EntityManager manager;
	
	public void insertEntry(Person p)
	{
		manager.merge(p);
	}
	
	public Person getById(int id){
		return manager.find(Person.class, id);
	};
	
	public void deleteById(int id)
	{
		manager.remove(id);
	}
	
	public List<Person> getAll()
	{
		TypedQuery<Person> p= manager.createNamedQuery("findAllPersons",Person.class);
		return p.getResultList();
	}
	
}
