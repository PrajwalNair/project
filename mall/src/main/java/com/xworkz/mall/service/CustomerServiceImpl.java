package com.xworkz.mall.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.mall.dto.CustomerFeedBackDetailsDTO;
import com.xworkz.mall.dto.CustomerPersonalDetailsDTO;
import com.xworkz.mall.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository repository;

	@Override
	public boolean validateAndSave(CustomerPersonalDetailsDTO dto) {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<CustomerPersonalDetailsDTO>> validate = validator.validate(dto);
		if (validate.size() > 0) {
			System.out.println("please fix the errors");
		} else {
			System.out.println("data is valid and saved");
			repository.save(dto);
		}
		return true;
	}

}
