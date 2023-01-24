package com.xworkz.mall.controller;

import static com.xworkz.mall.logger.Loggers.getLogger;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.mall.service.MallService;

@Controller
@RequestMapping("/forgotPassword")
public class ChangePasswordController {
	@Autowired
	private MallService service;
	private Logger logger = getLogger();

	public ChangePasswordController() {
		logger.info(getClass().getSimpleName());
	}

	@PostMapping
	public String onclick(@RequestParam String generatedPassword, @RequestParam String password,@RequestParam String password1, Model model) {
		
		
		if (generatedPassword != null && password.equals(password1)) {
			service.updatePasswordByGeneratedPassword(generatedPassword, password1);
			model.addAttribute("msg", "password is reset and updated");
			return "ChangePassword";
		} else {
			if(generatedPassword == null) {
			model.addAttribute("error", "password is not updated");
			return "ChangePassword";
			}
			return "ChangePassword";
		}

	}

}
