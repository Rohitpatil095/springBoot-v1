package com.app.file.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.file.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	
}
