package com.savej.secretary;

import java.util.Date;

import com.savej.temp.Notas;

public class Atividade extends Notas {
	// Atividade será agendada na classe agendamento
	public Atividade(int ano,String materia,float notas2) {
		setAno(ano);
		setMateria(materia);
		setNotas(notas2);
	}
	public Atividade() {
		
	}
	

}
