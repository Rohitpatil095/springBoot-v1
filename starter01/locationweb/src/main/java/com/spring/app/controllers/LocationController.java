package com.spring.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.app.entity.Locations;
import com.spring.app.services.LocationServiceImpl;

@Controller
public class LocationController {
	
	@Autowired
	LocationServiceImpl locServ;
	
	@RequestMapping("/")
	public String createView()
	{	
		return "createLocation";
	}
	
	@RequestMapping(value="/viewData", method=RequestMethod.POST)
	public String saveData(@ModelAttribute("location") Locations location, ModelMap model)
	{
		System.out.println("loc---------- "+ location.getType());
		Locations locations=locServ.saveLocation(location);
		String message="Location saved for id "+ locations.getId(); 
		model.addAttribute("msg",message);
		return "createLocation";
	}
	
	@RequestMapping("/viewAll")
	public String viewAllData(ModelMap model)
	{
		List<Locations> locations=locServ.getAllLocations();
		model.addAttribute("locations",locations);
		return "viewAll";
	}
	
	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("id") int id, ModelMap model)
	{
		Locations locRetrived =locServ.getLocationById(id);
		locServ.deleteLocation(locRetrived);
		List<Locations> locations= locServ.getAllLocations();
		model.addAttribute("locations",locations);
		return "viewAll";
	}
	
	@RequestMapping("/updateLocation")
	public String updateLocationMethode(@RequestParam("id") int id, ModelMap model)
	{
		Locations loc= locServ.getLocationById(id);
		model.addAttribute("location",loc);
		String msg="entry for "+ id+ " has been updated";
		return "updateLocation";
	}
	
	@RequestMapping("/viewUpdated")
	public String viewUpdatedLocations(@ModelAttribute("location") Locations location, ModelMap model)
	{
		System.out.println(location.toString());
		locServ.updateLocation(location);
		List<Locations> loc= locServ.getAllLocations();
		model.addAttribute("locations", loc);
		return "viewAll";
	}
}
