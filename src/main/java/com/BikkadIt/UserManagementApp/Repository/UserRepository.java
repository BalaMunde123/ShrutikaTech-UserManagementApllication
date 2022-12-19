package com.BikkadIt.UserManagementApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIt.UserManagementApp.entities.UserAccountEntity;

public interface UserRepository extends JpaRepository<UserAccountEntity, Integer>{

	
	public UserAccountEntity findByEmailAndPassword(String email,String password);
}
