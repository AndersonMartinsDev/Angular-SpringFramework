package com.calltech.security.service;

import com.calltech.security.entity.Perfil;
import com.calltech.security.repository.PerfilRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Slf4j
@Service
public class PerfilService {

    @Autowired
    private PerfilRepository perfilRepository;

    public void inserir(Perfil entity) {
        try {
            perfilRepository.save(entity);
        } catch (Exception e) {
            log.error("Error ao salvar novo usuário", e);
        }
    }

    public void excluir(Perfil user) {
        try {
            perfilRepository.delete(user);
        } catch (Exception ex) {
            log.error("Error ao deletar usuário ", ex);
        }
    }

    public List<Perfil> listar() {
        return perfilRepository.findAll();
    }

    public void atualizar(Perfil entity) {
        try {
            perfilRepository.save(entity);
        } catch (Exception e) {
            log.error("Error ao atualizar usuário", e);
        }
    }

}
