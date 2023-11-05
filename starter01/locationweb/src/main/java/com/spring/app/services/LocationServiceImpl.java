package com.spring.app.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.app.entity.Locations;
import com.spring.app.repos.LocationRepository;

@Component
public class LocationServiceImpl implements LocationService {

	@Autowired
	LocationRepository repositry;
	
	@Override
	public List<Locations> getAllLocations() {
		Iterable<Locations> allLoc= repositry.findAll();
		Iterator<Locations> locs=allLoc.iterator();
		List<Locations> location= new ArrayList<Locations>();

		while(locs.hasNext()) {
			location.add(locs.next());
		}
		
		return location;
		
	}

	@Override
	public Locations getLocationById(int id) {
		Optional<Locations> lo= repositry.findById(id);
		if(lo.isEmpty())
		{
			return null;
		}
		return lo.get();
	}

	@Override
	public Locations saveLocation(Locations loc) {
		Locations location=repositry.save(loc);
		if(location==null)
		{
			return null;
		}
		return location;
	}

	@Override
	public Locations updateLocation(Locations loc) {
		Locations currLocations = getLocationById(loc.getId());
		currLocations.setCode(loc.getCode());
		currLocations.setName(loc.getName());
		currLocations.setType(loc.getType());
		
		Locations updated =repositry.save(currLocations);
		return updated;
		
	}

	@Override
	public void deleteLocation(Locations loc) {
		repositry.deleteById(loc.getId());
		System.out.println("Deleted Location -> "+ loc.getName());
	}
	
	@Override
	public void deleteLocationById(int id)
	{
		repositry.deleteById(id);
		System.out.println("Location with id "+ id + " deleted");
	}
}
