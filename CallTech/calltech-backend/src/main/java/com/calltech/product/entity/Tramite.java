package com.calltech.product.entity;

import java.time.LocalDate;

import javax.persistence.*;


import lombok.*;

@Entity
@Getter
@Setter
@Table(name="tramites")
public class Tramite {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="dat_criacao",length=20)
	private LocalDate datCriado;
	/**
	@NotNull
	@OneToOne
	private User user;
	*/
	@Lob
	@Column(name="descricao",length=1000)
	private String descricao;
	
	@OneToOne
	private Chamado chamado;
}
