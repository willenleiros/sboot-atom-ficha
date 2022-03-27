package com.example.sbootatomficha.controller;

import com.example.sbootatomficha.domain.Ficha;
import com.example.sbootatomficha.domain.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("${spring.application.name}/api/fichas")
public class FichaController {

    @GetMapping
    public List<Ficha> listar(){
        List<Ficha> fichas = new ArrayList<>();
        Ficha ficha = new Ficha();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("willen");
        pessoa.setCpf("049.244.564-89");
        ficha.setPessoa(pessoa);
        ficha.setLocal("Centro de Conveções");
        ficha.setCodigo("NT01");
        fichas.add(ficha);
        return fichas;
    }

}
