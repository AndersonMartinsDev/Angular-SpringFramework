package com.calltech.security.config;

import com.calltech.security.entity.Usuario;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@NoArgsConstructor
public class UserRepositoryUserDetails extends Usuario implements UserDetails {

    private static final long serialVersionUID = 1L;

    private String username ="";
    private String password = "";
    private boolean enable = false;
    private boolean NoBlocked = false;
    private boolean NoExpired = false;
    private boolean NoExpiredAccount = false;
    private boolean NoExpiredCredencials = false;


    public UserRepositoryUserDetails(Usuario usuario){
        super(usuario);
        this.enable = true;
        this.NoBlocked = true;
        this.NoExpired = true;
        this.NoExpiredAccount = true;
        this.NoExpiredCredencials = true;
        this.password = usuario.getPassword();
        this.username = usuario.getUser();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return this.NoExpiredAccount;
    }

    @Override
    public boolean isAccountNonLocked() {
        return this.NoBlocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return this.NoExpired;
    }

    @Override
    public boolean isEnabled() {
        return this.enable;
    }
}
