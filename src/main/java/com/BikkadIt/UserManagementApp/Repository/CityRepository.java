package com.BikkadIt.UserManagementApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIt.UserManagementApp.entities.City;
@Repository
public interface CityRepository extends JpaRepository<City, Integer>{

}
