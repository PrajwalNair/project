package com.xworkz.mall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.mall.dto.AdminDTO;
import com.xworkz.mall.repository.MallRepositoryImpl;
import com.xworkz.mall.service.MallService;
import com.xworkz.mall.service.MallServiceImpl;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private MallService service;

	public AdminController() {
		System.out.println(getClass().getSimpleName());
	}

	@PostMapping
	public String onLogin(@RequestParam String name, @RequestParam String password, Model model) {
		System.out.println("on login method is running");
		AdminDTO findByNameAndPassword = service.findByNameAndPassword(name, password);
		AdminDTO findByName = service.findByName(name);
		if (findByNameAndPassword == null || findByName == null) {
			System.out.println("given credentials are invalid");
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
						&& findByNameAndPassword.getLoginCount() > 1) {
					System.out.println("account is unlocked");
					model.addAttribute("msg", "credentials are matching");
					model.addAttribute("dto", findByNameAndPassword);
					return "AdminSuccess";
				}
				if (findByNameAndPassword.getLoginCount() <= 1) {
					System.out.println("welcome to our page please change your password");
					model.addAttribute("msg1", "Congratulations you have logged in please change your password");
					return "ChangePassword";
				}

				return "Admin";
			}
		

		return "Admin";
	}
}