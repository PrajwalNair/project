package com.xworkz.mall.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.mall.dto.AdminDTO;

public interface MallService {
//	boolean validateAndSave(AdminDTO dto);

	AdminDTO findByNameAndPassword(String name, String password);

//	void updateNoOfWrongAttemptsByName(String name, int noOfAttempts);

	default boolean sendMail(String email, String password) {
		return true;
	}

	AdminDTO findByName(String name);

	AdminDTO updatePasswordByGeneratedPassword(String generatedPassword, String password);
	
	AdminDTO findByMallName(String mallName);
	
	AdminDTO updateAcountUnlockByName(String name,String status);
	
	AdminDTO updateActiveByGeneratedPassword(String generatedPassword,int active);
	
	AdminDTO findByGeneratedPassword(String password);
	
	AdminDTO findByPassword(String password);

}
