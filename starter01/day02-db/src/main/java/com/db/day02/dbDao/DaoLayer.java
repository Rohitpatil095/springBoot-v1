package com.db.day02.dbDao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.db.day02.customeDataDao.customeData;
import com.db.day02.entity.Bank;
import com.db.day02.repository.dataRepository;

@Service
public class DaoLayer{

	@Autowired
	private dataRepository dp;
	
	@Autowired
	private customeData cusData;
	
	
	public void getAllData()
	{
		Iterable<Bank> itr= dp.findAll();
		itr.forEach(it-> {System.out.println(it);});
	} 
	
	public void addAllBanks()
	{
		cusData.banks();
	}
	
	
	
	// hibernate or jpql auto query 
//	@Query("select n from User n")
//	public List<Bank> getDataUsingJPQL()
//	{
//	}

}
