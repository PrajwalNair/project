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
@RequestMapping("/forgotPassword")
public class ChangePasswordController {
	@Autowired
	private MallService service;

	public ChangePasswordController() {
		System.out.println(getClass().getSimpleName());
	}

	@PostMapping
	public String onclick(@RequestParam String generatedPassword, @RequestParam String password,@RequestParam String password1, Model model) {
		
		if (generatedPassword != null && password.equals(password1)) {
			service.updatePasswordByGeneratedPassword(generatedPassword, password1);
			model.addAttribute("msg", "password is reset and updated");
			return "ChangePassword";
		} else {
			model.addAttribute("error", "password is not updated");
			return "ChangePassword";
		}

	}

}
