package com.BikkadIt.UserManagementApp.payload;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserDto {
	
	private String firstName;

	private String lastName;

	private String email;

	private String phone;

	private Date dob;

	private String gender;

	private String country;

	private String state;

	private String city;

	private String password;

	private String accStatus;

}
