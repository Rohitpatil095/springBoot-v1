package com.spring.jdbc.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.jdbc.entity.Person;

@Repository
public class PersonJdbcRepository {
	
	@Autowired
	JdbcTemplate temp;
	
	public List<Person> findAll()
	{
		List<Person> op=temp.query("select * from Person",new BeanPropertyRowMapper<Person>(Person.class));
		return op;
	}
	
	public Person findById(int id)
	{
		return temp.queryForObject("select * from person where id=?",new Object[] {id}, new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public int deleteById(int id)
	{
		int p =temp.update("delete from person where id=?", new Object[] {id});
		return p;
	}
	
	public int insertPerson(Person p)
	{
		return temp.update("insert into person values(?,?,?,?)",p.getId(),p.getEmpName(),p.getEmpName(),p.getAge());
	}
	
	public int updatePerson(Person p, int index)
	{
		return temp.update("update person set emp_name=?, addr=?, age=? where id=?",new Object[] {p.getEmpName(), p.getAddr(), p.getAge(),new Object[] {1}});
	}
	 
}
