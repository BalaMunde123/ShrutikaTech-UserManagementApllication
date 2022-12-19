package com.BikkadIt.UserManagementApp.sevice;

import java.util.List;

import com.BikkadIt.UserManagementApp.entities.City;
import com.BikkadIt.UserManagementApp.entities.Country;
import com.BikkadIt.UserManagementApp.entities.State;
import com.BikkadIt.UserManagementApp.payload.Login;
import com.BikkadIt.UserManagementApp.payload.UnlockAccount;
import com.BikkadIt.UserManagementApp.payload.UserDto;


public interface UserServiceI {


	public List<Country> getAllCountry();

	public List<State> getAllStates(int countryId);
	
	public List<City> getAllCitis(int stateId);
	
	public boolean saveUser(UserDto user);
	
	public String loginCheck(Login login);
	
	public boolean unlockAccount(UnlockAccount unlockAccount);
	
}
