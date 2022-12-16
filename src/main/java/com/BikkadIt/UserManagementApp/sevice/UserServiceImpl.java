package com.BikkadIt.UserManagementApp.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.BikkadIt.UserManagementApp.Repository.CityRepository;
import com.BikkadIt.UserManagementApp.Repository.CountryRepository;
import com.BikkadIt.UserManagementApp.Repository.StateRepository;
import com.BikkadIt.UserManagementApp.entities.City;
import com.BikkadIt.UserManagementApp.entities.Country;
import com.BikkadIt.UserManagementApp.entities.State;



@Service
public class UserServiceImpl implements UserServiceI{
     @Autowired
	private CountryRepository countryRepository;
     
     @Autowired
     private StateRepository stateRepository;
     
     @Autowired
     private CityRepository cityRepository;
     
	@Override
	public List<Country> getAllCountry() {
		List<Country> findAll = countryRepository.findAll();
		return findAll;
	}

	@Override
	public List<City> getAllCitis(int stateId) {
		List<City> list = cityRepository.findByStateId(stateId);
		return list;
	}

	
	   @Override 
	   public List<State> getAllStates(int countryId) { 
	  List<State> list = this.stateRepository.findByCountryId(countryId);
	  return list;  
	  
	   }
	 	
	
    
	
}
