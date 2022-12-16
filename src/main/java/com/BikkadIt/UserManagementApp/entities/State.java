package com.BikkadIt.UserManagementApp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name ="STATE_MASTER")
@Setter
@Getter
@NoArgsConstructor
public class State {
	@Id
	@Column(name ="STATE_ID")
	private int stateid;
	@Column(name ="STATE_NAME")
	private String statename;
	@Column(name = "COUNTRY_ID")
	private int countryid;

}
