package com.xworkz.mall.repository;

import java.util.List;

import com.xworkz.mall.dto.CustomerFeedBackDetailsDTO;
import com.xworkz.mall.dto.CustomerPersonalDetailsDTO;

public interface CustomerRepository {
	boolean save(CustomerPersonalDetailsDTO dto);
	
	CustomerPersonalDetailsDTO findByName(String name);

}
