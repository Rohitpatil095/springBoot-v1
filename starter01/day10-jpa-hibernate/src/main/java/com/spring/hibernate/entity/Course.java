package com.spring.hibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	public String cName;
	public int cFees;
	public Course(String cName, int cFees) {
		super();
		this.cName = cName;
		this.cFees = cFees;
	}
	public Course() {
		super();
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getcFees() {
		return cFees;
	}
	public void setcFees(int cFees) {
		this.cFees = cFees;
	}
	public int getId() {
		return id;
	}
	
	
}
