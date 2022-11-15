package com.gmn.app.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gmn.app.dto.BankDTO;
import com.gmn.app.service.BankService;


@Controller
public class BankController {

	public BankController() {
		System.out.println("BankController constructor");
	}

	@Autowired
	BankService service;

	@PostMapping("bank/save")
	public ModelAndView saveBank(@ModelAttribute BankDTO dto) {
		System.out.println("-----saveBank----------" + this.getClass());
		BankDTO dto1 = service.savebankInfo(dto);
		System.out.println("-----saved ----------" + dto1.getId());

		return new ModelAndView("index", "bankSaved", dto1);
	}
	
	@RequestMapping("/searchname")
	public ModelAndView searchName(@RequestParam String bankName) {
		//@ModelAttribute will bind ui object to entity object
		System.out.println("-------searchName------1----"+bankName);

	BankDTO dto=service.findBankName(bankName);
	
	
	return new ModelAndView("customer","bank", dto);
	}

}
