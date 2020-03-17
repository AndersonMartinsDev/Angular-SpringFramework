package com.calltech.security.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "users", uniqueConstraints = {@UniqueConstraint(columnNames = { "username"}),
        @UniqueConstraint(columnNames = { "email" })})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotBlank
    @Size(min=3, max = 50)
    @Column(name="nome_user",length = 50)
    private String nome;

    @Email
    @NotBlank
    @Column(name="email",length = 40)
    private String email;

    @NotBlank
    @Size(min=3, max = 30)
    @Column(name="username",length = 30)
    private String username;

    @NotBlank
    @Column(name="password_user",length = 100)
    private String password;

    @Column(name="active_from")
    private LocalDate active_from;

    @Column(name="profile_photo")
    private String profile_photo;

    @Column(name="votes")
    private long votes;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Perfil> perfils = new HashSet<>();

    public User() {}

    public User(String name, String username, String email, String password) {
        this.nome = name;
        this.username = username;
        this.email = email;
        this.password = password;
    }

}
