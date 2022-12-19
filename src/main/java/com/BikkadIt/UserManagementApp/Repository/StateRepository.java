package com.BikkadIt.UserManagementApp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



import com.BikkadIt.UserManagementApp.entities.State;


public interface StateRepository extends JpaRepository<State, Integer> {

	public List<State> findByCountryId(int countryId);
	
	
}
