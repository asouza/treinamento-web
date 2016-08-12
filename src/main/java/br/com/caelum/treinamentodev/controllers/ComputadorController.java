package br.com.caelum.treinamentodev.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.caelum.treinamentodev.models.Computador;

@Controller
public class ComputadorController {

	@RequestMapping("/computador/form")
	public String form(Computador computador) {
		return "computador/form";
	}

	@RequestMapping("/novo/computador")
	public String cria(@Valid Computador computador, BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {
			return form(computador) ;
		}
		System.out.println(computador);
		return "salas/cadastro-ok";
	}
}
