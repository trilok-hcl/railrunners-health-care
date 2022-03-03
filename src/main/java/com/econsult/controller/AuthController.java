package com.econsult.controller;

import com.econsult.model.Login;
import com.econsult.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AuthController {

    @Autowired
    AuthRepository authRepository;

    @PostMapping(value = "/loginPage")
    public void save(@RequestBody Login login){
        authRepository.save(login);
    }

    @GetMapping(value = "/loginPage")
    public List<Login> getLogin() {
        return authRepository.findAll();
    }

    @GetMapping(value = "/loginPage/{id}")
    public Login getLoginById(@PathVariable String id){
        Optional<Login> login = authRepository.findById(id);
        return login.get();
    }
}
