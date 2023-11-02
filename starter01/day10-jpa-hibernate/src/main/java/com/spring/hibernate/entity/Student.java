package com.spring.hibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	public int id;
	public String sName;
	public String dept;
	
	@OneToOne
	Passport passport;
	
	public int getId() {
		return id;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public Student(String sName, String dept) {
		super();
		this.sName = sName;
		this.dept = dept;
	}
	public Student() {
		super();
	}
	
		
}

