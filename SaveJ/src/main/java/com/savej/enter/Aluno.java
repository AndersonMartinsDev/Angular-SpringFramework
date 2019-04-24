package com.savej.enter;


import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.savej.staff.Pessoa;

@Entity
public class Aluno extends Pessoa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private long id;
	
	
	public Aluno() {
		
	}
	public Aluno(String nome,String sexo,int ano,String cidadeNatal,LocalDate dataNascimento
			,String rg,String cpf,Filiacao filiacao) {
		setNome(nome);
		setSexo(sexo);
		 
		setCidadeNatal(cidadeNatal);
		setDataNascimento(dataNascimento);
		setRg(rg);
		setCpf(cpf);
		
	
	}
	

}
