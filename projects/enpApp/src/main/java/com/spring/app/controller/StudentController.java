package com.spring.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
	
	@RequestMapping(name = "/", method = RequestMethod.GET)
	public String locationController()
	{
		return "createLocation";
	}
	
//	@ResponseBody
//	@RequestMapping("/")
//	public String home()
//	{
//		return "hello";
//	}
}

