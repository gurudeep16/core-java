package com.gmn.app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class BankDTO {
	
	@Id
	@GeneratedValue
	private int id;
	private int bankId;
	private String bankName;
	private String branchName;
	private String IFSC_Code;
	private String address;
	
	

}
