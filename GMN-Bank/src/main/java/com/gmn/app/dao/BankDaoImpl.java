package com.gmn.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.gmn.app.dto.BankDTO;

@Repository
public class BankDaoImpl implements BankDao {
	
	public BankDaoImpl() {
		System.out.println("BankDaoImpl constructor");
	}

	@Autowired
	private EntityManagerFactory factory;
	private EntityManager entityManager=null;
	@Override
	public BankDTO savebankInfo(BankDTO dto) {
		System.out.println("--bank Dao---------");
		boolean isBankSaved=false;
		try {
		entityManager=factory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(dto);
		transaction.commit();
		System.out.println("--bank saved---------");

		isBankSaved=true;
		//entityManager.close();
		//factory.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return isBankSaved? dto : null;
	}

	@Override
	public BankDTO findBankName(String bankName) {
		BankDTO dto=null;
		try {
			entityManager = factory.createEntityManager();
			Query query = entityManager.createQuery("SELECT s FROM BankDTO s WHERE s.bankName=:bankName");
			query.setParameter("bankName", bankName);
			dto =  (BankDTO) query.getSingleResult();
			System.out.println("-------BankName------" + dto.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		return dto;
	}

	@Override
	public BankDTO updateBank(int bankId) {
		String sql = "";
		return null;
	}

}
