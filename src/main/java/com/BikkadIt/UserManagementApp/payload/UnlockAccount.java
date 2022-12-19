package com.BikkadIt.UserManagementApp.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UnlockAccount {
	
	private String email;
	private String tempPwd;
	private String confmPwd;
	private String newPassword;
	

}
