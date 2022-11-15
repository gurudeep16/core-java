package com.gmn.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmn.app.dao.CustomerDAO;
import com.gmn.app.dto.CustomerDTO;
import com.gmn.app.util.CustomerID;
import com.gmn.app.util.GenerateAccountNumber;

@Service
public class CustomerService_Impl implements CustomerService {

	@Autowired
	private CustomerDAO dao;
	@Autowired
	private BankService bankService;

	@Override
	public CustomerDTO saveCustomer(CustomerDTO dto) {

		int accNo = getAccNo();
		dto.setAccountNumber(accNo);
		
		int custI=getCustId();
		dto.setCustomerid(custI);	

		dto.setBank(bankService.findBankName(dto.getBankName()));
		
		System.out.println("--------CustomerService_Impl-------------");
		return dao.saveCustomer(dto);
	}

	@Override
	public List<CustomerDTO> searchCustomer(String govt_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getAccNo() {
		System.out.println();
		return GenerateAccountNumber.generateAccNo();
	}
	
	public int getCustId() {
		return CustomerID.generateCustId();
		
	}

	@Override
	public CustomerDTO updateCustomer(String accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
