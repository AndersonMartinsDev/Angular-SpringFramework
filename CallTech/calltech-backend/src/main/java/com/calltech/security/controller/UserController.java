package com.calltech.security.controller;

import com.calltech.security.entity.User;
import com.calltech.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("${project.version}/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public void inserir(@RequestBody User user){
        userService.inserir(user);
    }

    @GetMapping
    public List<User> listar(){
        return userService.listar();
    }

    @DeleteMapping
    public void excluir(@RequestBody User user){
        userService.excluir(user);
    }

    @PostMapping("/atualizar")
    public void atualizar(@RequestBody User user){
        userService.atualizar(user);
    }

}
