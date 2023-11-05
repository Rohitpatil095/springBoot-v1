package com.spring.app.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.app.entity.Vendor;

public interface VendorRepo extends JpaRepository<Vendor, Long> {

}
