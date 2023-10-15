package com.db.day03;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.db.day03.entity.Renting;

public interface UserRepository extends CrudRepository<Renting,Integer> {

	// Inbuild Queries can also be used 
	// check Day03DbHibApplication starting section-01 
	
	// Writing custom queries 
	
	@Query("select n from Renting n")
	public List<Renting> getHousesUsingJPQL();
	 
	@Query(value="select rent from Renting rent where rent.location= :loc")
	public List<Renting> getHouseUsingNativeJPQLWhere(@Param("loc")String location);

	
	@Query(value="select * from Renting", nativeQuery = true)
	public List<Renting> getHouseUsingNativeJPQL();
	
//	@Query(value="update renting r set r.rent= :updatedRent where r.rent<= :oldRentLimit")
//	public List<Renting> updateRentAmount(int updatedRent,int oldRentLimit);

}

