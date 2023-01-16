package com.xworkz.mall.service;

import com.xworkz.mall.dto.CustomerFeedBackDetailsDTO;
import com.xworkz.mall.dto.CustomerPersonalDetailsDTO;

public interface CustomerService {
	boolean validateAndSave(CustomerPersonalDetailsDTO dto);
	

}
