package com.BikkadIt.UserManagementApp.payload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Login {
	
	private String email;
	private String password;
	

}
