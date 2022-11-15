package com.gmn.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gmn.app.dto.CustomerDTO;
import com.gmn.app.service.CustomerService;

@Controller
@RequestMapping("/")
public class CustomerController {

	public CustomerController() {
		System.out.println("Controller constructor");
	}
	@Autowired
	CustomerService service;
	
	@RequestMapping(value="saveCustom" ,method=RequestMethod.POST )
	public ModelAndView saveCustom(@ModelAttribute CustomerDTO dto) {
		System.out.println("-----saveCustomer----------" + this.getClass());
		CustomerDTO dto1 = service.saveCustomer(dto);
		System.out.println("-----saved ----------" + dto1.getId());
		return new ModelAndView("welcome");
				}
	
}
