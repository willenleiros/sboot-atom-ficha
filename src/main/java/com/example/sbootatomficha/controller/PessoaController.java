package com.example.sbootatomficha.controller;

import com.example.sbootatomficha.domain.Pessoa;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {

    @GetMapping(path = "/keycloak")
    public HashMap index() {
        // get a successful user login
        OAuth2User user = ((OAuth2User) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        return new HashMap(){{
            put("hello", user.getAttribute("name"));
            put("your email is", user.getAttribute("email"));
        }};
    }

    @GetMapping
    public List<Pessoa> listar(){
        List<Pessoa> pessoas = List.of(new Pessoa("Antonio","123.456.789-00"));
        return pessoas;
    }

}
