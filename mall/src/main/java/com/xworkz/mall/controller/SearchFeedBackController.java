package com.xworkz.mall.controller;

import static com.xworkz.mall.logger.Loggers.getLogger;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.mall.dto.CustomerPersonalDetailsDTO;
import com.xworkz.mall.service.CustomerService;

@Controller
@RequestMapping("/feedback")
public class SearchFeedBackController {
	@Autowired
	private CustomerService service;
	
	private Logger logger = getLogger();
	
	public SearchFeedBackController() {
		logger.info(getClass().getSimpleName());
	}
	
	@PostMapping
	public String onSearch(@RequestParam String name, Model model) {
		List<CustomerPersonalDetailsDTO> findByName = service.findByName(name);
		
		if(findByName==null || findByName.isEmpty()) {
			model.addAttribute("error", "No Result Found");
			return "SearchFeedBack";
		}else {
			model.addAttribute("msg", "Results");
			model.addAttribute("list", findByName);
			return "SearchFeedBack";
		}
		
	}
	

}
