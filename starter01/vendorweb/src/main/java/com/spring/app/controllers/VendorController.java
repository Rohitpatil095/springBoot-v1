package com.spring.app.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.app.entity.Vendor;
import com.spring.app.services.VendorServiceImpl;

@Controller
public class VendorController {
	
	@Autowired
	private VendorServiceImpl vImpl;
	
	
	@RequestMapping("/")
	public String intial()
	{
		return "vendorsInitial";
	}
	
	@RequestMapping(value="/viewAll", method = RequestMethod.GET)
	public String viewVendors(ModelMap model)
	{
		List<Vendor> vendors =vImpl.getAllVendors();
		if(vendors.isEmpty())
		{
			return "emptyVendorData";
		}
		else
		{			
			model.addAttribute("vendors", vendors);
		}
		return "viewAllVendors";
	}
	
	@RequestMapping(value="/viewAll", method = RequestMethod.POST)
	public String viewAfterCreatedVendors(@ModelAttribute("vendor") Vendor vendor, ModelMap model)
	{
		vImpl.saveVendor(vendor);
		List<Vendor> ven= vImpl.getAllVendors(); 
		model.addAttribute("vendors", ven);
		return "viewAllVendors";
	}
	
	@RequestMapping("/addVendor")
	public String createVendor()
	{
		return "createVendor";
	}
	
	@RequestMapping("/deleteVendor")
	public String deleteVendor(Long id)
	{
		vImpl.deleteVendor(id);
		return "redirect:viewAll";
	}
	
	@RequestMapping(value="/updateVendor", method=RequestMethod.GET)
	public String updateVendorList(Long id, ModelMap model)
	{
		Vendor vendor= vImpl.getVendorById(id);
		model.addAttribute("vendor", vendor);
		return "updateVendor"; 
	}
	
	@RequestMapping(value="/updateVendor", method=RequestMethod.POST)
	public String updatedVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap model)
	{
		vImpl.saveVendor(vendor);
		List<Vendor> vendors= vImpl.getAllVendors();
		model.addAttribute("vendors", vendors);
		return "redirect:viewAll"; 
	}
}
