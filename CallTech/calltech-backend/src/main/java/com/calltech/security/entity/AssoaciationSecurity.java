package com.calltech.security.entity;


import lombok.Getter;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;

@Entity
@Getter
@Table(name="tb_associa_user_perfil")
public class AssoaciationSecurity {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Perfil perfil;
    @Enumerated
    private PermissoesEnum permissoes;
    @Enumerated
    private ModuloEnum modulo;

}
