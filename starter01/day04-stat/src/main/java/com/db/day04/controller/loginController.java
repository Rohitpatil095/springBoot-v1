package com.db.day04.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.db.day04.auth.authService;

@Controller
public class loginController {

	@Autowired
	private authService auth;
	
	private Logger logger =LoggerFactory.getLogger(getClass()); 
	
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping(value="login",method =RequestMethod.GET)
	public String userLogin()
	{
		return "login";
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public String welcomePage(@RequestParam String uName,@RequestParam String pass ,ModelMap model)
	{
		if(auth.isAuthenticated(uName, pass))
		{			
			model.put("name",uName);
			model.put("password", pass);
		
			return "welcome";
		}
		else
		{
			model.put("errMessage", "Login Credentials Are Invalid...");
			return "login";
		}
		
		
		// Generic way
//		if(uName.equals("rp@gmail.com") && pass.equals("root"))
//		{
//			return "welcome";
//		}
//		else
//		{
//			return "loginError";
//		}
	}
	
	@RequestMapping("/loginUser")
	public String loginUser(@RequestParam String name, ModelMap model)
	{
		logger.debug("Started loginUser request");
		model.put("userName", name);
		logger.warn("Added model and value init....");
		return "loginUser";
	}
	
	@RequestMapping("/welcome")
	public String welcome()
	{
		return "welcome";
	}
}
