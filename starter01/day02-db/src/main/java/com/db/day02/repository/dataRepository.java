package com.db.day02.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.db.day02.entity.Bank;

public interface dataRepository extends JpaRepository<Bank,Integer>{
	
	@Query("select n from n")
	public List<Bank> getBankDataByJPQL();

}
