package com.gmn.app.dao;

import java.util.List;

import com.gmn.app.dto.CustomerDTO;

public interface CustomerDAO {
	
	public CustomerDTO saveCustomer(CustomerDTO dto);
	public List<CustomerDTO> searchCustomer(String govt_id);
	public CustomerDTO updateCustomer(String accountNumber);
	
}
