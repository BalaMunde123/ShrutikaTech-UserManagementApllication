package com.BikkadIt.UserManagementApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIt.UserManagementApp.payload.Login;
import com.BikkadIt.UserManagementApp.sevice.UserServiceI;

@RestController
@RequestMapping("/login")
public class LoginController {
	@Autowired
	private UserServiceI userServiceI;
	
	@PostMapping("/{login}")
	public ResponseEntity<String> loginCheck(@RequestBody Login login){
		String loginCheck = this.userServiceI.loginCheck(login);
		return new ResponseEntity<String>(loginCheck,HttpStatus.OK);
	}

}
