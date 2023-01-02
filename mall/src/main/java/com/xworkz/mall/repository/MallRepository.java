package com.xworkz.mall.repository;

import java.util.List;
import java.util.Optional;

import com.xworkz.mall.dto.AdminDTO;

public interface MallRepository {
//	boolean save(AdminDTO dto);

	AdminDTO findByNameAndPassword(String name, String password);

	AdminDTO updateNoOfWrongAttempts(String name, int noOfAttempts);

	AdminDTO findByName(String name);

	AdminDTO updateLoginStatus(String name, int loginStatus);

	AdminDTO updateAccountLocked(String name, String accountLocked);

}
