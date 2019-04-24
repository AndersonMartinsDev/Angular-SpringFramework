package com.savej.mat;


import com.savej.staff.Pessoa;


public class Filiacao extends Pessoa{
	
	public Filiacao() {
		
	}
	public Filiacao(String nome,String cpf,String rg,String parentesco) {
		setNome(nome);
		setCpf(cpf);
		setRg(rg);
		setLigacaoFamiliar(parentesco);
	// Ver Questão de multiplos registros N-N
	}

}
