package com.spring.jdbc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;

@NamedQuery(name = "findAllPersons", query = "select p from Person p")
@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	public String empName;
	public String addr;
	public int age;
	
	public Person() {
		super();
	}
	
	public Person(String empName, String addr, int age) {
		super();
		this.empName = empName;
		this.addr = addr;
		this.age = age;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(short age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", empName=" + empName + ", addr=" + addr + ", age=" + age + "]";
	}
	
	

}
