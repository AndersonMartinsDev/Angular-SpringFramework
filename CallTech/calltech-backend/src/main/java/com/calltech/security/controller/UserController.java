package com.calltech.security.controller;

import com.calltech.security.entity.Usuario;
import com.calltech.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("${project.version}/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public void inserir(@RequestBody Usuario user){
        userService.inserir(user);
    }

    @GetMapping
    public List<Usuario> listar(){
        return userService.listar();
    }

    @DeleteMapping
    public void excluir(@RequestBody Usuario user){
        userService.excluir(user);
    }

    @PostMapping("/atualizar")
    public void atualizar(@RequestBody Usuario user){
        userService.atualizar(user);
    }

}
