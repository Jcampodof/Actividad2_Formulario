package com.everis.Act2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

	@RequestMapping("/")
	public String inicio(Model model) {

		
		
		
		return "index.jsp";
	}
}