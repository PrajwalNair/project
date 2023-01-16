package com.xworkz.mall.repository;

import java.time.LocalTime;
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
		try {
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
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;

	}

	@Override
	public AdminDTO updateNoOfWrongAttemptsByName(String name, int noOfAttempts) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Query query = manager.createNamedQuery("updateNoOfWrongAttemptsByName");
			query.setParameter("nm", name);
			query.setParameter("na", noOfAttempts);

			int executeUpdate = query.executeUpdate();
			transaction.commit();
			System.out.println(executeUpdate);

		} catch (PersistenceException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public AdminDTO findByName(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
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
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;

	}

	@Override
	public AdminDTO updateFirstLoginByName(String name, int loginStatus) {
		System.out.println("update login status method is running in the repository");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Query query = manager.createNamedQuery("updateFirstLoginByName");
			query.setParameter("nm", name);
			query.setParameter("lg", loginStatus);
			int executeUpdate = query.executeUpdate();
			transaction.commit();
			System.out.println(executeUpdate);

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public AdminDTO updateAccountLockedByName(String name, String accountLocked) {
		System.out.println("Account locked method is running in the repository");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Query query = manager.createNamedQuery("updateAccountLockedByName");
			query.setParameter("nm", name);
			query.setParameter("al", accountLocked);
			int executeUpdate = query.executeUpdate();	
			System.out.println(executeUpdate);
			transaction.commit();
			
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public AdminDTO updateGeneratedPasswordByName(String name, String generatedPassword) {
		System.out.println("update generated password by name method is running in repository");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Query query = manager.createNamedQuery("updateGeneratedPasswordByName");
			query.setParameter("nm", name);
			query.setParameter("gpas", generatedPassword);
			int executeUpdate = query.executeUpdate();
			transaction.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public AdminDTO updatePasswordByGeneratedPassword(String generatedPassword, String password) {
		System.out.println("update password by generated passwordd method is running");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Query query = manager.createNamedQuery("updatePasswordByGeneratedPassword");
			query.setParameter("ps", password);
			query.setParameter("gs", generatedPassword);
			int executeUpdate = query.executeUpdate();
			transaction.commit();
			System.out.println(executeUpdate);
		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public AdminDTO findByMallName(String mallName) {
		System.out.println("find by mall name method is running");
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByMallName");
			query.setParameter("mn", mallName);
			Object singleResult = query.getSingleResult();
			if (singleResult != null) {
				AdminDTO ref = (AdminDTO) singleResult;
				System.out.println("result is not null" + ref);
				return ref;
			} else {
				System.out.println("result is null");
				return null;
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public AdminDTO updateGeneratedPasswordByMallName(String mallName, String generatedPassword) {
		System.out.println("update generated password by mall name");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Query query = manager.createNamedQuery("updateGeneratedPasswordByMallName");
			query.setParameter("mn", mallName);
			query.setParameter("gp", generatedPassword);
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		}

		return null;
	}

	@Override
	public AdminDTO updateLoginCountByName(String name, int loginCount) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Query query = manager.createNamedQuery("updateLoginCountByName");
			query.setParameter("nm", name);
			query.setParameter("lc", loginCount);
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			manager.close();
		}

		return null;
	}

	@Override
	public AdminDTO updateTimeByMallName(String mallName, LocalTime time) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Query query = manager.createNamedQuery("updateTimeByMallName");
			query.setParameter("ml", mallName);
			query.setParameter("ti", time);
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			manager.close();
		}
		
		return null;
	}

	@Override
	public AdminDTO updateAcountUnlockByName(String mallName, String status) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Query query = manager.createNamedQuery("updateAcountUnlockByName");
			query.setParameter("nm", mallName);
			query.setParameter("st", status);
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			manager.close();
		}
		return null;
	}

	@Override
	public AdminDTO updateNoOfWrongAttemptsByMallName(String mallName, int noOfAttempts) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Query query = manager.createNamedQuery("updateNoOfWrongAttemptsByMallName");
			query.setParameter("mn", mallName);
			query.setParameter("no", noOfAttempts);
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		}
		return null;
	}

	@Override
	public AdminDTO findByGeneratedPassword(String generatedPassword) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByGeneratedPassword");
			query.setParameter("ps", generatedPassword);
			Object singleResult = query.getSingleResult();
			if(singleResult!=null) {
				AdminDTO ref = (AdminDTO)singleResult;
				System.out.println("data is present "+singleResult);
				return ref;
			}else {
				System.out.println("data is not present ");
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
	public AdminDTO updateGeneratedPasswordTimeByGeneratedPassword(String generatedPassword,
			LocalTime generatedPasswordTime) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Query query = manager.createNamedQuery("updateGeneratedPasswordTimeByGeneratedPassword");
			query.setParameter("gp", generatedPassword);
			query.setParameter("gpt", generatedPasswordTime);
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		}finally {
			manager.close();
		}
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
