package com.spring.hibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Passport {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	
	public String passNumber;
	public boolean isValid;
	
	@OneToOne(mappedBy = "student_id")
	Student student;
	
	public Passport() {
		super();
	}
	public Passport(String passNumber, boolean isValid) {
		super();
		this.passNumber = passNumber;
		this.isValid = isValid;
	}
	public String getPassNumber() {
		return passNumber;
	}
	public void setPassNumber(String passNumber) {
		this.passNumber = passNumber;
	}
	public boolean isValid() {
		return isValid;
	}
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	public int getId() {
		return id;
	}
	
	
	
}
