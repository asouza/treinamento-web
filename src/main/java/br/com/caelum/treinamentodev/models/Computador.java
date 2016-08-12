package br.com.caelum.treinamentodev.models;

import org.hibernate.validator.constraints.NotBlank;

public class Computador {

	@NotBlank(message="O campo não pode serem branco")
	private String numeroDeSerie;
	@NotBlank(message="O campo não pode serem branco")
	private String configuracao;
	@NotBlank(message="O campo não pode serem branco")
	private String observacao;
	
	@Override
	public String toString() {
		return "Computador [numeroDeSerie=" + numeroDeSerie + ", configuracao=" + configuracao
				+ ", observacao=" + observacao + "]";
	}
	public void setNumeroDeSerie(String numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}
	public void setConfiguracao(String configuracao) {
		this.configuracao = configuracao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getNumeroDeSerie() {
		return numeroDeSerie;
	}
	public String getConfiguracao() {
		return configuracao;
	}
	public String getObservacao() {
		return observacao;
	}
	

}
