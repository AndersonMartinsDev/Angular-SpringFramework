package com.calltech.security.service;

import com.calltech.security.entity.Usuario;
import com.calltech.security.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void inserir(Usuario entity) {
        try {
            userRepository.save(entity);
        } catch (Exception e) {
            log.error("Error ao salvar novo usuário", e);
        }
    }

    public void excluir(Usuario user) {
        try {
            userRepository.delete(user);
        } catch (Exception ex) {
            log.error("Error ao deletar usuário ", ex);
        }
    }

    public List<Usuario> listar() {
        return userRepository.findAll();
    }

    public void atualizar(Usuario entity) {
        try {
            userRepository.save(entity);
        } catch (Exception e) {
            log.error("Error ao atualizar usuário", e);
        }
    }
}
