package com.xworkz.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.mall.dto.AdminDTO;
import com.xworkz.mall.service.MallService;

@Controller
@RequestMapping("/reset")
public class ResetPasswordController {
	@Autowired
	private MallService service;

	public ResetPasswordController() {
		System.out.println(getClass().getSimpleName());
	}

	@PostMapping
	public String onReset(@RequestParam String mallName, Model model) {
		if (mallName != null) {
			service.findByMallName(mallName);
			model.addAttribute("msg", "password is sent to your mail id");
			return "ChangePassword";
		} else {
			if(mallName == null) {
			model.addAttribute("error", "selected mall is not found");
			return "ResetPassword";
			}
		}
		return null;
	}
	
}
