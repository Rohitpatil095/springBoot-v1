package com.spring.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

	
	@GetMapping("/")
	public String getHome()
	{
		return "logged in...";
	}
	
}
