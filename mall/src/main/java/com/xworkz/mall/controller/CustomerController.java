package com.xworkz.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.mall.dto.CustomerFeedBackDetailsDTO;
import com.xworkz.mall.dto.CustomerPersonalDetailsDTO;
import com.xworkz.mall.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService service;

	public CustomerController() {
		System.out.println(getClass().getSimpleName());
	}

	@PostMapping
	public String onSend(CustomerPersonalDetailsDTO dto, Model model, CustomerFeedBackDetailsDTO dto2) {
		System.out.println("on send method is running ");
		
		boolean findByEmail = service.findByEmail(dto.getEmail());
		boolean findByMobileNo = service.findByMobileNo(dto.getMobileNo());
		if (!findByEmail) {
			System.out.println(dto.getEmail());
			model.addAttribute("error", "Email already exists");
			return "Customer";
		} else if (!findByMobileNo) {
			System.out.println(dto.getMobileNo());
			model.addAttribute("error", "mobile number already exists");
			return "Customer";
		} else {
			dto.setFeedBackDTO(dto2);
			boolean validateAndSave = service.validateAndSave(dto);
			if (validateAndSave) {
				model.addAttribute("message", "Details saved successfully");
				model.addAttribute("dto", dto);
				model.addAttribute("dto1", dto2);
				return "Success";
			} else {
				model.addAttribute("error", "Details not saved ");
				return "Customer";
			}
		}

	}

}
