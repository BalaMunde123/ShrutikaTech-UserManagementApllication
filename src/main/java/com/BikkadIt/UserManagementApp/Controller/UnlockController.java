package com.BikkadIt.UserManagementApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIt.UserManagementApp.payload.UnlockAccount;
import com.BikkadIt.UserManagementApp.sevice.UserServiceI;

@RestController
public class UnlockController {
	@Autowired
	private UserServiceI userServiceI;
	
	@PutMapping("/unlockAcc")
	public ResponseEntity<String> unlockAccunt(@RequestBody UnlockAccount unlockAccount){
	
		boolean unlockAccount2 = this.userServiceI.unlockAccount(unlockAccount);
		
		if(unlockAccount2) {
			return new ResponseEntity<String>("Unlocked Successfull",HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("NOT Unloked",HttpStatus.OK);
		}
		
		
		
	}
	
	

}
