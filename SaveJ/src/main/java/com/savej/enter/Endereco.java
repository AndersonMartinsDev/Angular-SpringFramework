package com.savej.enter;


public class Endereco {
	
	private String rua;
	private String bairro;
	private String estado;
	private String complemento;
	private String cidade;
	private String pais;
	private String cep;
	private Filiacao filiacao;
	
	
	public Endereco(String rua, String bairro,String cidade,String estado,String cep,
			String pais,String complemento,Filiacao filiacao) {
		setRua(rua);
		setBairro(bairro);
		setCidade(cidade);
		setEstado(estado);
		setCep(cep);
		setPais(pais);
		setComplemento(complemento);
		setFiliacao(filiacao);
		
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
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
