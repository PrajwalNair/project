package com.xworkz.mall.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.mall.dto.CustomerFeedBackDetailsDTO;
import com.xworkz.mall.dto.CustomerPersonalDetailsDTO;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(CustomerPersonalDetailsDTO dto) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(dto);
			transaction.commit();
			System.out.println(dto);

		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			manager.close();
		}
		return true;
	}

	@Override
	public CustomerPersonalDetailsDTO findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
