package br.com.tokiomarine.seguradora.avaliacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.tokiomarine.seguradora.avaliacao.service.EstudandeService;

@Controller
@RequestMapping("")
public class GeralController {
	
	@Autowired
	EstudandeService service;
	
	@GetMapping("")
	public String index(Model model) {
		
		if(service.buscarEstudantes().isEmpty()) {
			model.addAttribute("estudantes", null);
			
		} else {
			
			model.addAttribute("estudantes", service.buscarEstudantes());			
		}
		
		return "index";
		
	}

}
