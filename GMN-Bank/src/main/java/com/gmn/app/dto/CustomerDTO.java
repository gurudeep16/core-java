package com.gmn.app.dto;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class CustomerDTO extends UserDTO {
	
	//@Id
	//@GeneratedValue
    //private int id;
	private String govt_id;
	@Column(unique = true)
	private int accountNumber;
	@Column(unique = true)
	private int customerid;
	private Double balance;
	@OneToOne
	private BankDTO bank;
	private String bankName;
	
	
}
