package com.savej.staff;



public abstract class Pessoa {

	protected String nome = "";
	protected String rg = "";
	protected String cpf = "";
	protected String email = "";
	protected int idade;
	protected String DataNascimento = null;
	protected String cidadeNatal = "";
	protected String ligacaoFamiliar = "";
	protected int ano;//>>> Ano ESCOLAR - não esquecer -> mesmo que Série
	protected String sexo;
	
	
	public abstract int getSexo();
	public abstract void setSexo(String sexo);
	public abstract int getAno();
	public abstract void setAno(int ano);
	public abstract String getNome();
	public abstract void setNome(String nome);
	public abstract String getRg();
	public abstract void setRg(String rg);
	public abstract String getCpf();
	public abstract void setCpf(String cpf);
	public abstract String getEmail();
	public abstract void setEmail(String email);
	public abstract String getDataNascimento();
	public abstract void setDataNascimento(String dataNascimento);
	public abstract String getCidadeNatal();
	public abstract void setCidadeNatal(String cidadeNatal);
	public abstract String getLigacaoFamiliar();
	public abstract void setLigacaoFamiliar(String ligacaoFamiliar);
	public abstract int getIdade();
	public abstract void setIdade(int idade);
}
