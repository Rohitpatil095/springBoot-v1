package com.app.brewcans.web.controllers;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.brewcans.web.models.CustomerDto;

@RequestMapping("/api/v1/cust")
@RestController
public class CustomerController {
	
	CustomerDto customerDto;
	
	public CustomerController(CustomerDto customerDto)
	{
		this.customerDto=customerDto;
	}
	
	@GetMapping({"/{custId}"})
	public ResponseEntity<CustomerDto> getCustomerById(@PathVariable("custId") UUID id)
	{
		return CustomerDto.build();
	}
	
	
}
