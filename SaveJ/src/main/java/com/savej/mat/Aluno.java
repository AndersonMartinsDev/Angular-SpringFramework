package com.savej.mat;


import java.time.LocalDate;

import com.savej.staff.Pessoa;


public class Aluno extends Pessoa {
	
	
	public Aluno() {
		
	}
	public Aluno(String nome,String sexo,int ano,String cidadeNatal,LocalDate dataNascimento
			,String rg,String cpf,Filiacao filiacao) {
		setNome(nome);
		setSexo(sexo);
		setAno(ano); // Classe alocada 
		setCidadeNatal(cidadeNatal);
		setDataNascimento(dataNascimento);
		setRg(rg);
		setCpf(cpf);
		
	
	}

}
