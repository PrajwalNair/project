package com.xworkz.mall.repository;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import com.xworkz.mall.dto.AdminDTO;

public interface MallRepository {
//	boolean save(AdminDTO dto);

	AdminDTO findByNameAndPassword(String name, String password);

	AdminDTO updateNoOfWrongAttemptsByName(String name, int noOfAttempts);

	AdminDTO findByName(String name);

	AdminDTO updateFirstLoginByName(String name, int loginStatus);

	AdminDTO updateAccountLockedByName(String name, String accountLocked);

	AdminDTO updateGeneratedPasswordByName(String name, String generatedPassword);

	AdminDTO updatePasswordByGeneratedPassword(String generatedPassword, String password);

	AdminDTO findByMallName(String mallName);

	AdminDTO updateGeneratedPasswordByMallName(String mallName, String generatedPassword);
	
	AdminDTO updateLoginCountByName(String name, int loginCount);
	
	AdminDTO updateTimeByMallName(String mallName, LocalTime time);
	
	AdminDTO updateAcountUnlockByName(String mallName,String status);
	
	AdminDTO updateNoOfWrongAttemptsByMallName(String mallName, int noOfAttempts);
	
	AdminDTO findByGeneratedPassword(String password);
	
	AdminDTO updateGeneratedPasswordTimeByGeneratedPassword(String generatedPassword, LocalTime generatedPasswordTime);
	
	AdminDTO updateActiveByGeneratedPassword(String generatedPassword,int active);
	
	AdminDTO findByPassword(String password);
	
	

}
