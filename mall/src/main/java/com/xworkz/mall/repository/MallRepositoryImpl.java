package com.xworkz.mall.repository;

import static com.xworkz.mall.logger.Loggers.getLogger;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

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
	private Logger logger = getLogger();

	@Override
	public AdminDTO findByNameAndPassword(String name, String password) {
		logger.info("find by name and password method is running in repository");
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByNameAndPassword");
			query.setParameter("nm", name);
			query.setParameter("ps", password);
			logger.info("------------------");
			Object singleResult = query.getSingleResult();
			System.out.println(singleResult);
			if (singleResult != null) {
				AdminDTO ref = (AdminDTO) singleResult;
				logger.info("result list is present " + ref);
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
			logger.info("no of wrong attempt is updated :"+executeUpdate);

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
				logger.info("result list is present " + ref);
				return ref;
			} else {
				logger.info("result list is null");
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
		logger.info("update login status method is running in the repository");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Query query = manager.createNamedQuery("updateFirstLoginByName");
			query.setParameter("nm", name);
			query.setParameter("lg", loginStatus);
			int executeUpdate = query.executeUpdate();
			
			logger.info("first login is updated :"+executeUpdate);
			transaction.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public AdminDTO updateAccountLockedByName(String name, String accountLocked) {
		logger.info("Account locked method is running in the repository");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Query query = manager.createNamedQuery("updateAccountLockedByName");
			query.setParameter("nm", name);
			query.setParameter("al", accountLocked);
			int executeUpdate = query.executeUpdate();	
			logger.info("Account locked is updated :"+executeUpdate);
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
		logger.info("update generated password by name method is running in repository");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Query query = manager.createNamedQuery("updateGeneratedPasswordByName");
			query.setParameter("nm", name);
			query.setParameter("gpas", generatedPassword);
			int executeUpdate = query.executeUpdate();
			transaction.commit();
			logger.info("Generated password is updated :"+executeUpdate);

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public AdminDTO updatePasswordByGeneratedPassword(String generatedPassword, String password) {
		logger.info("update password by generated passwordd method is running");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Query query = manager.createNamedQuery("updatePasswordByGeneratedPassword");
			query.setParameter("ps", password);
			query.setParameter("gs", generatedPassword);
			int executeUpdate = query.executeUpdate();
			transaction.commit();
			logger.info("Password is updated "+executeUpdate);
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
		logger.info("find by mall name method is running");
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByMallName");
			query.setParameter("mn", mallName);
			Object singleResult = query.getSingleResult();
			if (singleResult != null) {
				AdminDTO ref = (AdminDTO) singleResult;
				logger.info("result is not null" + ref);
				return ref;
			} else {
				logger.info("result is null");
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
		logger.info("update generated password by mall name");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Query query = manager.createNamedQuery("updateGeneratedPasswordByMallName");
			query.setParameter("mn", mallName);
			query.setParameter("gp", generatedPassword);
			int executeUpdate = query.executeUpdate();
			logger.info("generated password by mallName :"+executeUpdate);
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
			logger.info("login count is updated by name :"+executeUpdate);
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
			logger.info("time is updated by mallName :"+executeUpdate);
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
			logger.info("Account unlock is updated by name :"+executeUpdate);
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
			logger.info("no of wrong attemptsis updated by mallName :"+executeUpdate);
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
				logger.info("data is present "+ref);
				return ref;
			}else {
				logger.info("data is not present ");
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
			logger.info("generated password time is updated by generated password :"+executeUpdate);
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
	public AdminDTO updateActiveByGeneratedPassword(String GeneratedPassword, int active) {
		logger.info("update active by name and password method is running");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Query query = manager.createNamedQuery("updateActiveByGeneratedPassword");
			query.setParameter("ps", GeneratedPassword);
			query.setParameter("ac", active);
			int executeUpdate = query.executeUpdate();
			logger.info("active is updated :"+executeUpdate);
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
	public AdminDTO findByPassword(String password) {
		logger.info("find by password method is running in the repository");
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByPassword");
			query.setParameter("ps", password);
			Object singleResult = query.getSingleResult();
			if(singleResult!=null) {
				AdminDTO ref = (AdminDTO)singleResult;
				logger.info("password is not empty in the repository"+ref);
				return ref;
			}else {
				logger.info("password is null in the repository");
				return null;
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
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
