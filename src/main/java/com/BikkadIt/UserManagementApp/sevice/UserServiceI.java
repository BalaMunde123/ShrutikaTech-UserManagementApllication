package com.BikkadIt.UserManagementApp.sevice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.BikkadIt.UserManagementApp.entities.City;
import com.BikkadIt.UserManagementApp.entities.Country;
import com.BikkadIt.UserManagementApp.entities.State;


public interface UserServiceI {


	public List<Country> getAllCountry();

	public List<State> getAllStates(int countryId);
	
	public List<City> getAllCitis(int stateId);
	
}
