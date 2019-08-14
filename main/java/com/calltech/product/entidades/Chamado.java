package com.calltech.product.entidades;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

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
	
	@Lob
	@Column(name="descricao",length=1000)
	private String descricao;
	
	@DateTimeFormat
	@Column(name="dat_criacao",length=20)
	private LocalDate criacao;
	

	@DateTimeFormat
	@Column(name="dat_alteracao",length=20)
	private LocalDate alteracao;
	

	@DateTimeFormat
	@Column(name="dat_vencimento",length=20)
	private LocalDate vencimento;
	

	@DateTimeFormat
	@Column(name="dat_fechamento",length=20)
	private LocalDate fechamento;
	
	@OneToMany(cascade=CascadeType.REMOVE)
	@JoinColumn(name="fk_chamado")
	private Set<Tramite> tramites;
	
	@OneToMany(cascade=CascadeType.REMOVE)
	@JoinColumn(name="fk_chamado")
	private Set<HistoricoChamado> historico;
	
}
