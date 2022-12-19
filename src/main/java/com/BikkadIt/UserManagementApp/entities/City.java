package com.BikkadIt.UserManagementApp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name ="CITY_MASTER")
@Setter
@Getter
@ToString
public class City {
	@Id
	@Column(name ="CITY_ID")
	private int cityId;
	@Column(name ="CITY_NAME")
	private String cityName;
	@Column(name ="SATE_ID")
	private int stateId;

}
