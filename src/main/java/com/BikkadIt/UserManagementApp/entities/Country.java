package com.BikkadIt.UserManagementApp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="COUNTRY_MASTER")
@Setter
@Getter
@NoArgsConstructor
public class Country {
	@Id
	@Column(name ="COUNTRY_ID")
	private int countryId;
	@Column(name ="COUNTRY_NAME")
	private String countryName;
	

}
