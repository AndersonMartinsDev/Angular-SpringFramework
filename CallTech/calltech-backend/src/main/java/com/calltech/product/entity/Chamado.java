package com.calltech.product.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Chamado {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_chamado")
	private Long codChamado;
	
	@Column(name="numero_call",length=10)
	private int numeroChamado;

	@Column(name="titulo",length=300)
	private String titulo;

	@Lob
	@Column(name="descricao",length=1000)
	private String descricao;

}
