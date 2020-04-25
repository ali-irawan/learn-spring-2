package com.devtalks.spring.session2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomePageController {

	// http://localhost:8080/
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String homePage() {
		return "index";
	}
}
