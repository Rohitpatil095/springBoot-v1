package com.db.day04.auth;

import org.springframework.stereotype.Service;

@Service
public class authService {
	

	public boolean isAuthenticated(String uName, String pass)
	{
		return uName.equals("rp@gmail.com") && pass.equals("root");
	}
}
