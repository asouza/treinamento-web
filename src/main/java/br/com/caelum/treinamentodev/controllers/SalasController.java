package br.com.caelum.treinamentodev.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.caelum.treinamentodev.models.Sala;

@Controller
public class SalasController {

	@RequestMapping("/salas/form")
	public String form() {
		return "salas/form";
	}
	
	@RequestMapping("/nova/sala")
	public String cria(@Valid Sala sala,BindingResult bindingResult,Model model){
		
		if(bindingResult.hasErrors()){			
			model.addAttribute("erros", bindingResult);
			model.addAttribute("sala", sala);
			
			return "salas/form";
		}
		
		return "salas/cadastro-ok";
	}
}
