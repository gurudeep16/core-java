package com.gmn.app.service;

import java.util.List;

import com.gmn.app.dto.BankDTO;

public interface BankService {

	public BankDTO savebankInfo(BankDTO dto);
	public BankDTO findBankName(String bankName);
	public BankDTO updateBank(int bankId);
}
