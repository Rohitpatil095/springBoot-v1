package com.db.day02.req;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.db.day02.dbDao.DaoLayer;

@Controller
public class req {

	@Autowired
	private DaoLayer dl;
	
	
	@RequestMapping("/")
	@ResponseBody
	public String myData()
	{
		dl.getAllData();
		return "data showed";
	}
	
	@RequestMapping("/addAll")
	@ResponseBody
	public String addAllBanks()
	{
		dl.addAllBanks();
		return "Added data";
	}
}
