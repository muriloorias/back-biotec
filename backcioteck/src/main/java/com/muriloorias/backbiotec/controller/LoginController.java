package com.muriloorias.backbiotec.controller;

import org.springframework.web.bind.annotation.RestController;

import com.muriloorias.backbiotec.models.User;
import com.muriloorias.backbiotec.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RequestMapping("/auth")
@RestController
public class LoginController {
    @Autowired
    private UserRepo repository;
    @PostMapping("/login")

    public String postMethodName(@RequestBody User user ) {
        repository.save(user);
        return "conta criada!";
    }

    @PostMapping("/login")
    public String login(@RequestBody User loginData) {
        var user = repository.findByEmailAndSenha(loginData.getEmail(), loginData.getPassword());
        
        if (user.isPresent()) {
            return "Login realizado! Bem-vindo " + user.get().getEmail();
        } else {
            return "Email ou senha incorretos.";
        }
    }
    

}
