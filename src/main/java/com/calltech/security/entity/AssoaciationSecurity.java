package com.calltech.security.entity;


import lombok.Getter;
import org.hibernate.annotations.CollectionType;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Table(name="tb_associa_user_perfil")
public class AssoaciationSecurity {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Perfil perfil;

    private PermissoesEnum permissoes;

    @Enumerated
    private ModuloEnum modulo;

}
