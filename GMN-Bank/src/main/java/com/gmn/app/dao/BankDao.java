package com.gmn.app.dao;



import com.gmn.app.dto.BankDTO;

public interface BankDao {
	
	public BankDTO savebankInfo(BankDTO dto);
	public BankDTO findBankName(String bankName);
	public BankDTO updateBank(int bankId);

}
