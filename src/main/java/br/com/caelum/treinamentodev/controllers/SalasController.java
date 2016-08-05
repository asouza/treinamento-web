package br.com.caelum.treinamentodev.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.caelum.treinamentodev.models.Sala;

@Controller
public class SalasController {

	@RequestMapping("/salas/form")
	public String form() {
		return "salas/form";
	}
	
	@RequestMapping("/nova/sala")
	public String cria(Sala sala){
		System.out.println(sala);
		
		return "salas/form";
	}
}
