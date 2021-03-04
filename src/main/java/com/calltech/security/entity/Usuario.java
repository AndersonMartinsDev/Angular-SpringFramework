package com.calltech.security.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Arrays;
import java.util.List;

//TODO:Criar um método para bloquear a conta caso a senha seja errada, ou qualquer regra para expirar ou bloquear a conta de usuário

@Entity
@Getter
@Setter
@Table(name="tb_usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="nome_user",length = 100)
    private String nome;

    @Email
    @Column(name="email_user",length = 40,unique = true)
    private String email;

    @Column(name="cl_user",length = 30)
    private String user;

    @Column(name="password_user",length = 100)
    private String password;

    @OneToMany
    private List<Perfil> perfil;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="user_role",
            joinColumns=@JoinColumn(name="usuario_id"),
            inverseJoinColumns=@JoinColumn(name="role_id")
    )
    private List<Roles> roles;


    public Usuario(){}

    public Usuario(Usuario usuario){
        super();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
        this.password = usuario.getPassword();
        this.user = usuario.getUser();
    }
    public Usuario(String name, String email, String password, String user,List<Roles> roles){
        super();
        this.nome = name;
        this.email = email;
        this.password = password;
        this.user = user;
        this.roles = roles;
    }

}
