package br.com.caelum.treinamentodev.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.caelum.treinamentodev.daos.SalaDao;
import br.com.caelum.treinamentodev.models.Sala;

@Controller
public class SalasController {
	
	@Autowired
	private SalaDao salaDao;

	@RequestMapping("/salas/form")
	public String form(Sala sala) {
		return "salas/form";
	}
	
	@RequestMapping("/nova/sala")
	public String cria(@Valid Sala sala,BindingResult bindingResult,Model model){
		
		if(bindingResult.hasErrors()){					
			return form(sala);
		}
		
		salaDao.salva(sala);
		return "salas/cadastro-ok";
	}
}
