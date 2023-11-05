package com.spring.app.repos;

import org.springframework.data.repository.CrudRepository;

import com.spring.app.entity.Locations;

public interface LocationRepository extends CrudRepository<Locations, Integer> {

}
