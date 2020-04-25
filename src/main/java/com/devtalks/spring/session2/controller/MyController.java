package com.devtalks.spring.session2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping(value="/about")
	// Tidak ditentukan method, defaultnya RequestMethod.GET
	public String about() {
		
		return "about"; // Akan cari about.jsp
	}
}
