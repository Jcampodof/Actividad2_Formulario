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
			@RequestParam(value="limite") String limite,
			@RequestParam(value="codigoPostal") String codigoPostal,
			RedirectAttributes model) {
		
		//System.out.println(nombre+""+apellido+""+limite);
		model.addAttribute("nombre", nombre);
		model.addAttribute("apellido", apellido);
		model.addAttribute("limite", limite);
		model.addAttribute("codigoPostal", codigoPostal);
		
        int validaciones = 0;
        if(nombre.length()>0 && apellido.length()>0 && limite.length() >0 && codigoPostal.length()>0) {
                validaciones++;
        }
        if(nombre.length()<11 && apellido.length()<11) {
                validaciones++;
        }
        if(limite.length()>0 && limite.length()<6) {
                validaciones++;
        }
        if(codigoPostal.length()==8) {
                validaciones++;
        }
        
        if (validaciones ==4) {
        //System.out.println(validaciones);
        
        return "redirect:view";
        }
        else {
        	
                System.out.println("Campos no Válidos!");
                return "index.jsp";
		
		//ra.addFlashAttribute("persona", model);
		//return "index.jsp";
		
		
	}

	}
}

