package com.calltech.security.config;

import com.calltech.security.entity.Usuario;
import com.calltech.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class DetalhesUsuariosServico implements UserDetailsService {

    private final UserRepository repository;

    @Autowired
    public DetalhesUsuariosServico(UserRepository repository){
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = repository.findByEmail(username);
        if(usuario == null){
            throw new UsernameNotFoundException(String.format("Usuário não existe",username));
        }
        return new UserRepositoryUserDetails(usuario);
    }
}
