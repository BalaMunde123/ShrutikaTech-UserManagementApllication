package com.BikkadIt.UserManagementApp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIt.UserManagementApp.entities.City;

public interface CityRepository extends JpaRepository<City, Integer>{
	
	public List<City> findByStateId(int stateId);

}
