package com.savej.mat;


public class Telefone {
	
	private Filiacao filiacao = new Filiacao();
	private String numero;
	private String operadora;
	private boolean movel;
	
	
	public Telefone() {
		
	}
	
	public Telefone(String numero, String operadora,boolean movel,Filiacao filiacao) {
		setNumero(numero);
		setOperadora(operadora);
		setMovel(movel);
		setFiliacao(filiacao);
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getOperadora() {
		return operadora;
	}
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	public boolean isMovel() {
		return movel;
	}
	public void setMovel(boolean movel) {
		this.movel = movel;
	}

	/**
	 * @return the filiacao
	 */
	public Filiacao getFiliacao() {
		return filiacao;
	}

	/**
	 * @param filiacao the filiacao to set
	 */
	public void setFiliacao(Filiacao filiacao) {
		this.filiacao = filiacao;
	}
}
