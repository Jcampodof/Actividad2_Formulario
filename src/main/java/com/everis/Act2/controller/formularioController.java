package com.everis.Act2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class formularioController {
	@RequestMapping("/registro")
	public String registro(@RequestParam(value="nombre") String nombre,
			@RequestParam(value="apellido") String apellido,
			@RequestParam(value="limite") int limite,
			@RequestParam(value="codigoPostal") String codigoPostal,
			RedirectAttributes model) {
		
		System.out.println(nombre+""+apellido+""+limite);
		model.addAttribute("nombre", nombre);
		model.addAttribute("apellido", apellido);
		model.addAttribute("limite", limite);
		model.addAttribute("codigoPostal", codigoPostal);
		
		//ra.addFlashAttribute("persona", model);
		//return "index.jsp";
		return "redirect:view";
		
	}

	
	
}
