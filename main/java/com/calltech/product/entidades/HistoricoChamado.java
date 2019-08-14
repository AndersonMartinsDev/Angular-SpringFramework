package com.calltech.product.entidades;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="historico_chamado")
public class HistoricoChamado {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="dat_alteracao")
	private LocalDate datAlterado;
	/*
	@OneToOne
	private User usuarioAlt; //User resp por alterar 
	*/
	@Column(name="status",length=15)
	private StatusEnum status;
	
	@Column(name="natureza",length=15)
	private NaturezaEnum natureza;

}
