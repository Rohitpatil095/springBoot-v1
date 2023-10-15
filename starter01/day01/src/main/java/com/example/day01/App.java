package com.example.day01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class App {

	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/contacts")
	public String contacts()
	{
		return "contact";
	}
}
