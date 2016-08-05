package br.com.caelum.treinamentodev.models;

import javax.validation.constraints.Min;

public class Sala {

	@Min(value=1,message="numero tem que ser maior que zero")
	private int numero;
	@Min(value=0,message="quantidade é zero ou mais")
	private int quantidadeComputadores;
	
	@Override
	public String toString() {
		return "Sala [numero=" + numero + ", quantidadeComputadores=" + quantidadeComputadores
				+ "]";
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setQuantidadeComputadores(int quantidadeComputadores) {
		this.quantidadeComputadores = quantidadeComputadores;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public int getQuantidadeComputadores() {
		return quantidadeComputadores;
	}

}
