package com.xworkz.mall.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
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
	public List<CustomerPersonalDetailsDTO> findByName(String name) {
		System.out.println("find by name method is running");
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByName1");
			query.setParameter("nm", name);
			List resultList = query.getResultList();
			if(resultList!=null) {
				
				System.out.println("result is not empty"+resultList);
				return resultList;
			}else {
				System.out.println("data is empty" + resultList);
				return null;
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
		return null;
		
	}
	
	@Override
	public List<CustomerPersonalDetailsDTO> findByEmail(String email) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByEmail");
			query.setParameter("em", email);
			List resultList = query.getResultList();
			if (resultList.isEmpty()) {
				return null;
			} else if (!resultList.isEmpty()) {
				return resultList;
			}

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
		
	}

	@Override
	public List<CustomerPersonalDetailsDTO> findByMobileNo(long mobileNo) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByMobileNo");
			query.setParameter("mb", mobileNo);
			List resultList = query.getResultList();
			if (resultList.isEmpty()) {
				return null;
			} else if (!resultList.isEmpty()) {
				return resultList;
			}

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

//	@Override
//	public boolean save(CustomerFeedBackDetailsDTO dto) {
//		EntityManager manager = factory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		try {
//			transaction.begin();
//			manager.persist(dto);
//			transaction.commit();
//			System.out.println(dto);
//
//		} catch (PersistenceException e) {
//			e.printStackTrace();
//			transaction.rollback();
//		} finally {
//			manager.close();
//		}
//		return true;
//	}

}
