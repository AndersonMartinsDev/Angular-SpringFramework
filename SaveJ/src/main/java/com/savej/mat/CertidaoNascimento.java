package com.savej.mat;

import java.time.LocalDate;

public class CertidaoNascimento {

		private Aluno aluno;
		private Filiacao filiacao;
		private Endereco endereco;
		private LocalDate dataNascimento;
		private String folha;
		private String livro;
		private String cidadeRegistro;
		
		public CertidaoNascimento() {
			
		}
		public Aluno getAluno() {
			return aluno;
		}
		public void setAluno(Aluno aluno) {
			this.aluno = aluno;
		}
		public Filiacao getFiliacao() {
			return filiacao;
		}
		public void setFiliacao(Filiacao filiacao) {
			this.filiacao = filiacao;
		}
		public Endereco getEndereco() {
			return endereco;
		}
		public void setEndereco(Endereco endereco) {
			this.endereco = endereco;
		}
		public LocalDate getDataNascimento() {
			return dataNascimento;
		}
		public void setDataNascimento(LocalDate dataNascimento) {
			this.dataNascimento = dataNascimento;
		}
		public String getFolha() {
			return folha;
		}
		public void setFolha(String folha) {
			this.folha = folha;
		}
		public String getLivro() {
			return livro;
		}
		public void setLivro(String livro) {
			this.livro = livro;
		}
		public String getCidadeRegistro() {
			return cidadeRegistro;
		}
		public void setCidadeRegistro(String cidadeRegistro) {
			this.cidadeRegistro = cidadeRegistro;
		}
	
}
