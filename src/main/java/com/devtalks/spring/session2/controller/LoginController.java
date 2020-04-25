package com.devtalks.spring.session2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {

		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginPost(ModelMap model, @RequestParam("username") String user,
			@RequestParam("password") String password) {

		System.out.println("Username: " + user);
		System.out.println("Password: " + password);
		
		model.put("username", user);
		
		return "welcome";
	}
}
