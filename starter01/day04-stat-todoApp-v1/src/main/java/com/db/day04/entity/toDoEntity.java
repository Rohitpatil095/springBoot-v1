package com.db.day04.entity;

import java.sql.Date;

public class toDoEntity {

//	id
//	username
//	description
//	targetDate 
//	done
	
	public int id;
	public String userName;
	public Date targetDate;
	public boolean done;	
	
	public toDoEntity() {
		super();
	}
	
	public toDoEntity(int id, String userName, Date targetDate, boolean done) {
		super();
		this.id = id;
		this.userName = userName;
		this.targetDate = targetDate;
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

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	
}
