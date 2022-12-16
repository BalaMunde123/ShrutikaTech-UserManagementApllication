package com.BikkadIt.UserManagementApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIt.UserManagementApp.entities.City;
import com.BikkadIt.UserManagementApp.entities.Country;
import com.BikkadIt.UserManagementApp.entities.State;
import com.BikkadIt.UserManagementApp.sevice.UserServiceI;

@RestController
public class UserController {
	
	@Autowired
	private UserServiceI userServiceI;
	
  /**
   * @author Balasaheb
   * @apiNote GetAllCountry
   * 	
   * @return
   */
	@GetMapping(value ="/getAllCountry",produces ="application/json")
	public ResponseEntity<List<Country>> getAllCountry(){
		List<Country> list = userServiceI.getAllCountry();
		return new ResponseEntity<List<Country>>(list,HttpStatus.OK);
		}
	
	/**
	 * @author Balasaheb
	 * @apiNote GetAllState
	 *   
	 * @param countryId
	 * @return
	 */
	 @GetMapping(value ="/getAllState/{countryId}",produces ="application/json")
	  public ResponseEntity<List<State>> getAllState(@PathVariable Integer countryId){ 
		  List<State> list = userServiceI.getAllStates(countryId); 
		  return new ResponseEntity<List<State>>(list,HttpStatus.OK); }
	 
	
	@GetMapping("/getAllcities/{stateId}")
	public ResponseEntity<List<City>> getAllCities(@PathVariable Integer stateId){
		List<City> allCitis = this.userServiceI.getAllCitis(stateId);
		return new ResponseEntity<List<City>>(allCitis,HttpStatus.OK);
		
	}
	
}
