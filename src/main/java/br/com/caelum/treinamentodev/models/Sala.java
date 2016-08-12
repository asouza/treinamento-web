package br.com.caelum.treinamentodev.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;

@Entity
public class Sala {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
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
