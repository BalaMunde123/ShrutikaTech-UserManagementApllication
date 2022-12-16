package com.BikkadIt.UserManagementApp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.BikkadIt.UserManagementApp.entities.State;
@Repository

public interface StateRepository extends JpaRepository<State, Integer> {

	public List<State> findByCountryId(Integer countryId);
	
	
}
