package com.savej.temp;

public abstract class Notas {

	protected String materia;
	protected float notas;
	protected int cargaHoraria;
	protected int ano;
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public float getNotas() {
		return notas;
	}
	public void setNotas(float notas2) {
		this.notas = notas2;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
