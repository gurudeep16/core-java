package com.gmn.app.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmn.app.dao.BankDao;
import com.gmn.app.dto.BankDTO;

@Service
public class BankServiceImpl implements BankService{

	@Autowired
	private BankDao bankDao;
	
	public BankDTO savebankInfo(BankDTO dto) {
		
		return bankDao.savebankInfo(dto);
	}

	public BankDTO findBankName(String bankName) {
		// TODO Auto-generated method stub
		return  bankDao.findBankName(bankName);
	}

	public BankDTO updateBank(int bankId) {
		// TODO Auto-generated method stub
		return null;
	}

}
