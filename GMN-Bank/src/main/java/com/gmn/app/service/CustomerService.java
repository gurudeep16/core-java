package com.gmn.app.service;

import java.util.List;

import com.gmn.app.dto.CustomerDTO;

public interface CustomerService {

	public CustomerDTO saveCustomer(CustomerDTO dto);
	public List<CustomerDTO> searchCustomer(String govt_id);
	public CustomerDTO updateCustomer(String accountNumber);
}
