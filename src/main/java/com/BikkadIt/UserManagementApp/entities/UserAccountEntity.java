package com.BikkadIt.UserManagementApp.entities;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name ="USER_MASTER")
@Setter
@Getter
@ToString
public class UserAccountEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="USER_ID")
	private int userId;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name ="LAST_NAME")
	private String lastName;
	
	@Column(name ="E_MAIL")
	private String email;
	
	@Column(name ="PHONE")
    private String phone;
	@Column(name ="DOB")
    private Date dob;
	@Column(name ="GENDER")
    private String gender;
	@Column(name ="COUNTRY")
    private String country;
    @Column(name ="STATE")
	private String state;
    @Column(name ="CITY")
	private String city;
    @Column(name ="PASSWORD")
	private String password;
    @Column(name ="ACCSTATUS")
	private String accStatus; 
	@CreationTimestamp
	@Column(name ="CREATED_DATE",updatable =false)
	private LocalDate createdDate;
	@UpdateTimestamp
	@Column(name ="UPDATED_DATE",insertable =false)
	private LocalDate updatedDate;
	

}
