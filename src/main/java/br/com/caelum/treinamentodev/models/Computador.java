package br.com.caelum.treinamentodev.models;

public class Computador {

	private String numeroDeSerie;
	private String configuracao;
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
	

}
