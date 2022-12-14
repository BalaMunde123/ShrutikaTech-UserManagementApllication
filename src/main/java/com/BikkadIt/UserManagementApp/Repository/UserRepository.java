package com.BikkadIt.UserManagementApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIt.UserManagementApp.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
