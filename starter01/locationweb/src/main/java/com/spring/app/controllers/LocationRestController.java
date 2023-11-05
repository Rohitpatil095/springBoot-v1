package com.spring.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.app.entity.Locations;
import com.spring.app.services.LocationServiceImpl;

@RestController
@RequestMapping("/location")
public class LocationRestController {

	@Autowired
	LocationServiceImpl locSvc;
	
	// get  All
	@GetMapping
	public List<Locations> loc() 
	{
		return locSvc.getAllLocations();
	}
	
	// get one
	@GetMapping("{id}")
	public Locations locById(@PathVariable("id") int id)
	{
		return locSvc.getLocationById(id);
	}
	
	// put/update
	@PutMapping
	public Locations updateLocation(@RequestBody Locations location)
	{
		return locSvc.saveLocation(location);
	}
	
	// delete
	@DeleteMapping("/{id}")
	public void deleteLocation(@PathVariable("id") int id)
	{
		locSvc.deleteLocationById(id);
	}
	
	// create/save
	@PostMapping()
	public Locations saveLocation(@RequestBody Locations location)
	{
		return locSvc.saveLocation(location);
	}
	
	
}
