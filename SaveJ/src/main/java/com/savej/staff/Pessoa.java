package com.savej.staff;

import java.time.LocalDate;

public class Pessoa {

	private String nome = "";
	private String rg = "";
	private String cpf = "";
	private String email = "";
	private int idade;
	private LocalDate DataNascimento = null;
	private String cidadeNatal = "";
	private String ligacaoFamiliar = "";
	private int ano;//>>> Ano ESCOLAR - não esquecer -> mesmo que Série
	private String sexo;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public LocalDate getDataNascimento() {
		return DataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		DataNascimento = dataNascimento;
	}
	public String getCidadeNatal() {
		return cidadeNatal;
	}
	public void setCidadeNatal(String cidadeNatal) {
		this.cidadeNatal = cidadeNatal;
	}
	public String getLigacaoFamiliar() {
		return ligacaoFamiliar;
	}
	public void setLigacaoFamiliar(String ligacaoFamiliar) {
		this.ligacaoFamiliar = ligacaoFamiliar;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	
	
	
}
