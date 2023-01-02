package com.xworkz.mall.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.mall.dto.AdminDTO;

@Repository
public class MallRepositoryImpl implements MallRepository {
	@Autowired
	private EntityManagerFactory factory;

	@Override
	public AdminDTO findByNameAndPassword(String name, String password) {
		System.out.println("find by name and password method is running in repository");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByNameAndPassword");
		query.setParameter("nm", name);
		query.setParameter("ps", password);
		System.out.println("------------------");
		Object singleResult = query.getSingleResult();
		System.out.println(singleResult);
		if (singleResult != null) {
			AdminDTO ref = (AdminDTO) singleResult;
			System.out.println("result list is present " + ref);
			return ref;
		} else {
			System.out.println("result list is not present ");
			return null;
		}

	}

	@Override
	public AdminDTO updateNoOfWrongAttempts(String name, int noOfAttempts) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Query query = manager.createNamedQuery("updateNoOfWrongAttempts");
		query.setParameter("nm", name);
		query.setParameter("na", noOfAttempts);

		int executeUpdate = query.executeUpdate();
		System.out.println(executeUpdate);
		return null;
	}

	@Override
	public AdminDTO findByName(String name) {
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByName");
		query.setParameter("nm", name);
		Object singleResult = query.getSingleResult();
		if (singleResult != null) {
			AdminDTO ref = (AdminDTO) singleResult;
			System.out.println("result list is present " + ref);
			return ref;
		} else {
			System.out.println("result list is null");
			return null;
		}

	}

	@Override
	public AdminDTO updateLoginStatus(String name, int loginStatus) {
		System.out.println("update login status method is running in the repository");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Query query = manager.createNamedQuery("updateLoginStatus");
		query.setParameter("nm", name);
		query.setParameter("lg", loginStatus);
		int executeUpdate = query.executeUpdate();
		System.out.println(executeUpdate);
		return null;
	}

	@Override
	public AdminDTO updateAccountLocked(String name, String accountLocked) {
		System.out.println("Account locked method is running in the repository");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Query query = manager.createNamedQuery("updateAccountLocked");
		query.setParameter("nm", name);
		query.setParameter("al", accountLocked);
		int executeUpdate = query.executeUpdate();
		System.out.println(executeUpdate);
		return null;
	}

//	@Override
//	public boolean save(AdminDTO dto) {
//		System.out.println("save method is running in repository");
//		EntityManager manager = factory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		try {
//			transaction.begin();
//			manager.persist(dto);
//			transaction.commit();
//		} catch (PersistenceException e) {
//			e.printStackTrace();
//		} finally {
//			manager.close();
//		}
//		return true;
//	}

}
