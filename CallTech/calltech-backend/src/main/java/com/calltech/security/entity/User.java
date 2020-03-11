package com.calltech.security.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="nome_user",length = 100)
    private String nome;

    @Email
    @Column(name="email_user",length = 40)
    private String email;

    @Column(name="user",length = 30)
    private String user;

    @Column(name="password_user",length = 100)
    private String password;

    @OneToMany
    private List<Perfil> perfis;
}
