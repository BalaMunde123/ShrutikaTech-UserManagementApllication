package com.BikkadIt.UserManagementApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIt.UserManagementApp.sevice.UserServiceI;

@RestController
public class UserController {
	@Autowired
	private UserServiceI userServiceI;

}
