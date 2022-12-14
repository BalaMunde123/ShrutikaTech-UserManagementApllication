package com.BikkadIt.UserManagementApp.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIt.UserManagementApp.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserServiceI{
    @Autowired
	private UserRepository userRepository;
	
}
