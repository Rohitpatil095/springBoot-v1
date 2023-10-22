package com.db.day04.entity;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

@Service
public class toDoEntity {

//	id
//	username
//	description
//	targetLocalDate 
//	done
	
	public int id=0;
	public String userName="default";
	public LocalDate targetLocalDate=LocalDate.now();
	 
	@Size(min = 10, message = "Atleast 10 chars are expected")
	public String description="";
	public boolean done=false;	
	
	public toDoEntity() {
		super();
	}
	
	public toDoEntity(int id, String userName,String description,LocalDate targetLocalDate, boolean done) {
		super();
		this.id = id;
		this.userName = userName;
		this.targetLocalDate = targetLocalDate;
		this.description = description;
		this.done = done;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public LocalDate getTargetLocalDate() {
		return targetLocalDate;
	}

	public void setTargetLocalDate(LocalDate targetLocalDate) {
		this.targetLocalDate = targetLocalDate;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "toDoEntity [id=" + id + ", userName=" + userName + ", targetLocalDate=" + targetLocalDate + ", done="
				+ done + "]";
	}

	
	
	
}
