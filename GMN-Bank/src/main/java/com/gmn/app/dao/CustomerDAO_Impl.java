package com.gmn.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gmn.app.dto.CustomerDTO;

@Repository
public class CustomerDAO_Impl implements CustomerDAO {

	
	public CustomerDAO_Impl() {
		System.out.println("Customer DAO constructor");
	}

	@Autowired
	private EntityManagerFactory factory;
	private EntityManager entityManager=null;
	
	
	@Override
	public CustomerDTO saveCustomer(CustomerDTO dto) {
		System.out.println("--------saveCustomer-------------");

		boolean isCustomerSaved=false;
		try {
			entityManager=factory.createEntityManager();
			EntityTransaction transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(dto);
			transaction.commit();
			System.out.println("customer saved");
			isCustomerSaved=true;
		} catch (Exception e) {
			e.printStackTrace();
		
	}
		return isCustomerSaved? dto : null;
	}

	@Override
	public List<CustomerDTO> searchCustomer(String govt_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerDTO updateCustomer(String accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
