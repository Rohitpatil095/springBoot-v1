package com.db.day04.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.db.day04.userAuthServices.authService;

@Controller
public class taskController {

	@Autowired
	private authService auth;

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String homePage()
	{
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String userToDoList(@RequestParam String userName, @RequestParam String userPass, ModelMap model)
	{
		if(auth.isAuthenticatedUser(userName,userPass))
		{
			model.put("username",userName);
			model.put("userpass", userPass);
			return userName+"userTodoList"; 
		}
		else
		{	
			model.put("errMessage", "Wrong login Credentials");
			return "login";
		}
		
	}
	
	@RequestMapping("add")
	public String addTask()
	{
		return "add";
	}
	
	
}
