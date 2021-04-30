package com.everis.Act2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class viewController {

	@RequestMapping("/view")
	public String inicio(@RequestParam(value="nombre") String nombre,
			@RequestParam(value="apellido") String apellido,
			@RequestParam(value="limite") int limite,
			@RequestParam(value="codigoPostal") String codigoPostal,
			Model model) {
		
		model.addAttribute("nombre", nombre);
		model.addAttribute("apellido", apellido);
		model.addAttribute("limite", limite);
		model.addAttribute("codigoPostal", codigoPostal);
		
		return "view.jsp";
	}
}
