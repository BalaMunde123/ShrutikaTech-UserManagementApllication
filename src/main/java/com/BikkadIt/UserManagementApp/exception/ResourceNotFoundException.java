package com.BikkadIt.UserManagementApp.exception;

public class ResourceNotFoundException extends RuntimeException{
	
	private String fieldName;
	private int fieldId;
	public ResourceNotFoundException(String fieldName, int fieldId) {
		super();
		this.fieldName = fieldName;
		this.fieldId = fieldId;
	}
	

}
