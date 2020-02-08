package com.calltech.product.entity;


import com.calltech.util.EntityHistory;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="tb_demanda")
public class Demanda {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @DateTimeFormat
    private LocalDate created;

    @DateTimeFormat
    @Column(name="dat_vencimento",length=20)
    private LocalDate vencimento;

    @DateTimeFormat
    @Column(name="dat_fechamento",length=20)
    private LocalDate closed;

    @OneToOne
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    @JoinColumn(name = "id_chamado")
    private Chamado chamado;

    @OneToMany
    @JoinColumn(name="id_demanda")
    private List<Tramite> tramites;

    @Enumerated
    @Column(name="status",length=15)
    private StatusEnum status;

    @Enumerated
    @Column(name="natureza",length=15)
    private NaturezaEnum natureza;

}
