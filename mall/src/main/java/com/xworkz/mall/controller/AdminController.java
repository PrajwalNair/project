package com.xworkz.mall.controller;

import static com.xworkz.mall.logger.Loggers.getLogger;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.mall.dto.AdminDTO;
import com.xworkz.mall.service.MallService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private MallService service;
	
	private Logger logger = getLogger();

	public AdminController() {
		logger.info(getClass().getSimpleName());
	}

	@PostMapping
	public String onLogin(@RequestParam String name, @RequestParam String password, Model model) {
		logger.info("on login method is running");
		AdminDTO findByNameAndPassword = service.findByNameAndPassword(name, password);
		AdminDTO findByName = service.findByName(name);
		if (findByNameAndPassword == null || findByName == null) {
			logger.info("given credentials are invalid");
			model.addAttribute("error", "credentials are not matching");
			if (findByName != null && findByName.getAccountLocked().equals("locked")) {
				System.out.println("Account is locked");
				model.addAttribute("error1", "Your account is locked please reset the password");
				return "Admin";
			}
			return "Admin";
		}

		if (findByNameAndPassword != null) {
			if (findByNameAndPassword.getAccountLocked().equals("unlocked") 
					&& findByNameAndPassword.getActive() == 1) {
				logger.info("account is unlocked");
				model.addAttribute("msg", "credentials are matching");
				model.addAttribute("dto", findByNameAndPassword);
				return "AdminSuccess";
			}
			if (findByNameAndPassword.getActive() == 0) {
				logger.info("welcome to our page please change your password");
				model.addAttribute("msg1", "Congratulations you have logged in please change your password");
				return "ChangePassword";
			}

			return "Admin";
		}

		return "Admin";
	}
}