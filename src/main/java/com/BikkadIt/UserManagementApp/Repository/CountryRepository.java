package com.BikkadIt.UserManagementApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIt.UserManagementApp.entities.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
