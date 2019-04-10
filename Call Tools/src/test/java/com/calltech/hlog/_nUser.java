package com.calltech.hlog;

import javax.persistence.Entity;

/*
 * Anderson Martins - 09/04/2019
 * Classe teste para novo usuário
 * */

public class _nUser {
	
	private static int inc = 0;
	private int cod_nUser;
	private String nome_user;
	private String senha_user;
	private String email_user;
	private String telefone_user;
	private boolean aprovacao_admin;
	
	
	
	
 	public _nUser(){
 	   setCod_nUser(inc++);
 	   setAprovacao_admin(false);
 	}
 	

	// GET \ SETTERS 
	public int getCod_nUser() {
		return cod_nUser;
	}
	public void setCod_nUser(int cod_nUser) {
		this.cod_nUser = cod_nUser;
	}
	public String getNome_user() {
		return nome_user;
	}
	public void setNome_user(String nome_user) {
		this.nome_user = nome_user;
	}
	public String getSenha_user() {
		return senha_user;
	}
	public void setSenha_user(String senha_user) {
		this.senha_user = senha_user;
	}
	public String getEmail_user() {
		return email_user;
	}
	public void setEmail_user(String email_user) {
		this.email_user = email_user;
	}
	public String getTelefone_user() {
		return telefone_user;
	}
	public void setTelefone_user(String telefone_user) {
		this.telefone_user = telefone_user;
	}
	public boolean isAprovacao_admin() {
		return aprovacao_admin;
	}
	public void setAprovacao_admin(boolean aprovacao_admin) {
		this.aprovacao_admin = aprovacao_admin;
	}

}
