package com.xworkz.mall.repository;

import java.util.List;

import com.xworkz.mall.dto.CustomerFeedBackDetailsDTO;
import com.xworkz.mall.dto.CustomerPersonalDetailsDTO;

public interface CustomerRepository {
	boolean save(CustomerPersonalDetailsDTO dto);

//	boolean save(CustomerFeedBackDetailsDTO dto);

	List<CustomerPersonalDetailsDTO> findByName(String name);

	List<CustomerPersonalDetailsDTO> findByEmail(String email);

	List<CustomerPersonalDetailsDTO> findByMobileNo(long mobileNo);

}
