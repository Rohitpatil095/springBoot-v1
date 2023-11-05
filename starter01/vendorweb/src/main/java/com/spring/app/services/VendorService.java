package com.spring.app.services;

import java.util.List;

import com.spring.app.entity.Vendor;

public interface VendorService {
	
	List<Vendor> getAllVendors();
	Vendor getVendorById(Long id);
	Vendor saveVendor(Vendor v);
	Vendor updateVendor(Vendor v);
	void deleteVendor(Long id);
}
