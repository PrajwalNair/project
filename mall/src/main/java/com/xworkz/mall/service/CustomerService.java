package com.xworkz.mall.service;

import java.util.List;

import com.xworkz.mall.dto.CustomerFeedBackDetailsDTO;
import com.xworkz.mall.dto.CustomerPersonalDetailsDTO;

public interface CustomerService {
	boolean validateAndSave(CustomerPersonalDetailsDTO dto);

//	boolean validateAndSave(CustomerFeedBackDetailsDTO dto);

	List<CustomerPersonalDetailsDTO> findByName(String name);

	boolean findByEmail(String email);

	boolean findByMobileNo(long mobileNo);
	
	default boolean sendMail(String email) {
		return true;
	}

}
