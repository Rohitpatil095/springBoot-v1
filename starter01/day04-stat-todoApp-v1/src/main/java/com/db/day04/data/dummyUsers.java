package com.db.day04.data;

public class dummyUsers {
	
	public String userName;
	public String userPassword;
	
	
	public dummyUsers() {
		super();
	}
	
	
	public dummyUsers(String userName, String userPassword) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
	}


	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
	

}
