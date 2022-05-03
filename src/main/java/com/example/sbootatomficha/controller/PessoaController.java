package com.example.sbootatomficha.controller;

import com.example.sbootatomficha.domain.Pessoa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("${spring.application.name}/api/pessoas")
public class PessoaController {

    @GetMapping
    public List<Pessoa> listar(){
        List<Pessoa> pessoas = List.of(new Pessoa("Antonio","123.456.789-00"));
        return pessoas;
    }

}
