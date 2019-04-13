package com.savej.mat;


import com.savej.secretary.Atividade;
import com.savej.staff.Pessoa;


public class Aluno extends Pessoa {
	private Filiacao filiacao; 
	private Atividade atividade;
	
	public Aluno() {
		
	}
	public Aluno(String nome,String sexo,int ano,String cidadeNatal,String dataNascimento
			,String rg,String cpf,Filiacao filiacao) {
		setNome(nome);
		setSexo(sexo);
		setAno(ano); // Classe alocada 
		setCidadeNatal(cidadeNatal);
		setDataNascimento(dataNascimento);
		setRg(rg);
		setCpf(cpf);
		setFiliacao(filiacao); // Chave FK
	
	}
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getRg() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRg(String rg) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getCpf() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCpf(String cpf) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getCidadeNatal() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCidadeNatal(String cidadeNatal) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getLigacaoFamiliar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLigacaoFamiliar(String ligacaoFamiliar) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getIdade() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setIdade(int idade) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getAno() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setAno(int ano) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getSexo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSexo(String sexo) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getDataNascimento() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setDataNascimento(String dataNascimento) {
		// TODO Auto-generated method stub
		
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

	public Atividade getAtividade() {
		return atividade;
	}
	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}

}
