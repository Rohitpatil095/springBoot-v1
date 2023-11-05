package com.spring.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	
	@Column(name = "sName")
	public String sName;
	@Column(name="cName")
	public String cName;
	@Column(name="fee")
	public int fee;
	
	public Student() {
		super();
	}
	
	public Student(String sName, String cName, int fee) {
		super();
		this.sName = sName;
		this.cName = cName;
		this.fee = fee;
	}
	
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public long getId() {
		return id;
	}
}
