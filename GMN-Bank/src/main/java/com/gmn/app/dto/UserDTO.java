package com.gmn.app.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@MappedSuperclass
@Data
public class UserDTO {

	@Id
	@GeneratedValue
	private int id;
	private String firstName;
	private String lastName;
	private String address;
	private String mobileNumber;
	@Column(unique = true)
	private String email;
	private String userName;
	private String password;
	private String gender;	

}
