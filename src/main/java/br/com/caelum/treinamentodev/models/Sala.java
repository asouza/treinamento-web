package br.com.caelum.treinamentodev.models;

public class Sala {

	private int numero;
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

}
