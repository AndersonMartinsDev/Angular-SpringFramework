package com.calltech.security.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="tb_perfil")
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 100,nullable = false)
    private String titulo;

    private String descricao;

}
