package com.spring.app.services;

import java.util.List;

import com.spring.app.entity.Locations;

public interface LocationService {
	
	List<Locations> getAllLocations();
	Locations getLocationById(int id);
	Locations saveLocation(Locations loc);
	Locations updateLocation(Locations loc);
	void deleteLocation(Locations loc);
	void deleteLocationById(int id);

}
