package com.db.day04.auth;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.db.day04.data.dummyUsers;

@Service
public class authService {
	
	
	
	ArrayList<dummyUsers> users= new ArrayList<>(List.of(
			new dummyUsers("suzi@gmail.com","dasdso"),
			new dummyUsers("das@yahoo.com","opo"),
			new dummyUsers("rachit@yahoo.com","rao"),
			new dummyUsers("fet@yahoo.com","fet"),
			new dummyUsers("root","root")
			));


	public boolean isAuthenticatedUser(String userName, String userPassword)
	{
		for(dummyUsers user:users)
		{
			if(userName.equals(user.getUserName()))
			{
				if(userPassword.equals(user.getUserPassword()))
				{
					return true;
				}
			}
		}
		return false;
	}
	
}
