package com.spring.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.app.entity.Vendor;
import com.spring.app.repos.VendorRepo;

@Component
public class VendorServiceImpl implements VendorService {
	
	@Autowired
	private VendorRepo vRepo;

	@Override
	public List<Vendor> getAllVendors() {
		return vRepo.findAll();
	}

	@Override
	public Vendor getVendorById(Long id) {
		Optional<Vendor> vendor=vRepo.findById(id);
		return vendor.get();
	}

	@Override
	public Vendor saveVendor(Vendor v) {
		return vRepo.save(v);
	}

	@Override
	public Vendor updateVendor(Vendor v) {
		Vendor currVendor = getVendorById(v.getId());
		
		currVendor.setAddress(v.getAddress());
		currVendor.setCode(v.getCode());
		currVendor.setEmail(v.getEmail());
		currVendor.setName(v.getName());
		currVendor.setPhone(v.getPhone());
		currVendor.setType(v.getType());
			
		Vendor updatedVendor= vRepo.save(currVendor);
		
		return updatedVendor;
	}

	@Override
	public void deleteVendor(Long id) {
		Optional<Vendor> v=vRepo.findById(id);
		vRepo.deleteById(id);
		System.out.println("Vedor deleted with id "+ v.get().getId());
		
	}

}
