package com.spring.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="locations")
public class Locations {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String code;
	private String name;
	private String type;
	
	public Locations() {
		super();
	}
	
	public Locations(int id,String code, String name, String type) {
		super();
		this.id=id;
		this.code = code;
		this.name = name;
		this.type = type;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}

	@Override
	public String toString() {
		return "Locations [id=" + id + ", code=" + code + ", name=" + name + ", type=" + type + "]";
	}
	
}
