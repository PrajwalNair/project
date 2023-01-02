package com.xworkz.mall.service;

import java.util.List;
import java.util.Optional;

import com.xworkz.mall.dto.AdminDTO;

public interface MallService {
//	boolean validateAndSave(AdminDTO dto);

	AdminDTO findByNameAndPassword(String name, String password, AdminDTO dto);

	void updateNoOfWrongAttempts(String name, int noOfAttempts);

	default boolean sendMail(String email) {
		return true;
	}

	AdminDTO findByName(String name);

}
