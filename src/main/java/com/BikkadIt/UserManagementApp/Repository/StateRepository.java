package com.BikkadIt.UserManagementApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIt.UserManagementApp.entities.State;
@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
