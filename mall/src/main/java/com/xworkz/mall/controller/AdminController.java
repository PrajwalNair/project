package com.xworkz.mall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.mall.dto.AdminDTO;
import com.xworkz.mall.service.MallService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private MallService service;
	private int count = 0;

	public AdminController() {
		System.out.println(getClass().getSimpleName());
	}

	@GetMapping
	public String onLogin(@RequestParam String name, @RequestParam String password, Model model, AdminDTO dto) {
		System.out.println("on login method is running");
		AdminDTO findByName = service.findByName(name);
		if (findByName != null) {
			service.findByNameAndPassword(name, password, dto);
			System.out.println("find by name and password is not null in controller");
			model.addAttribute("msg", "credentials are matched");
			return "AdminPage";
		} else {
			System.out.println("find by name and password is null in controller");
			model.addAttribute("error", "credentials are not matching");
			return "AdminPage";
		}

	}
}
