package com.spring.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.jdbc.entity.Person;
import com.spring.jdbc.repository.PersonJdbcRepository;
import com.spring.jdbc.repository.PersonJpa;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class Day09SpringJdbc01Application implements CommandLineRunner {

	@Autowired
	PersonJdbcRepository repo;

	@Autowired
	PersonJpa jp;
//	Logger logger= new LoggerF

	public static void main(String[] args) {
		SpringApplication.run(Day09SpringJdbc01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println(repo.findAll());
//		System.out.println(repo.findById(2));
//		System.out.println(repo.deleteById(1));
		
		
		Person p = new Person("updated","updat addr",40);
//		System.out.println(repo.updatePerson(p,1));
//		jp.insertEntry(p);
		System.out.println("----------"+ jp.getAll());
		System.out.println(jp.getById(2));
//		jp.deleteById(1);
		
		
	}

	
}
