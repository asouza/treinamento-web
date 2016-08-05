package br.com.caelum.treinamentodev.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.caelum.treinamentodev.models.Computador;

@Controller
public class ComputadorController {

	@RequestMapping("/computador/form")
	public String form() {
		return "computador/form";
	}
	
	@RequestMapping("/novo/computador")
	public String cria(Computador computador){
		System.out.println(computador);
		
		return "computador/form";
	}
}
