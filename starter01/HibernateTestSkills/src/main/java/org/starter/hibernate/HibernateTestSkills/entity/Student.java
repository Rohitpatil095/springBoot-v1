package org.starter.hibernate.HibernateTestSkills.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	public String name;
	public String dept;
	public boolean isActiveProfile;
	
	
	public Student() {
		super();
	}
	
	public Student(String name, String dept, boolean isActiveProfile) {
		super();
		this.name = name;
		this.dept = dept;
		this.isActiveProfile = isActiveProfile;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public boolean isActiveProfile() {
		return isActiveProfile;
	}
	public void setActiveProfile(boolean isActiveProfile) {
		this.isActiveProfile = isActiveProfile;
	}
	public int getId() {
		return id;
	}
	
	
	
}
