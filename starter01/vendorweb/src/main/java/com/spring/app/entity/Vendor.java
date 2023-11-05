package com.spring.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="vendor")
public class Vendor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String code;
	private String name;
	private String type;
	private String email;
	private String phone;
	private String address;
	
	public Vendor() {
		super();
	}
	public Vendor(String code, String name, String type, String email, String phone, String address) {
		super();
		this.code = code;
		this.name = name;
		this.type = type;
		this.email = email;
		this.phone = phone;
		this.address = address;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Vendor [id=" + id + ", code=" + code + ", name=" + name + ", type=" + type + ", email=" + email
				+ ", phone=" + phone + ", address=" + address + "]";
	}
	
}
