package com.example.sbootatomficha.controller;

import com.example.sbootatomficha.domain.Ficha;
import com.example.sbootatomficha.domain.Pessoa;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("${spring.application.name}/api/fichas")
public class FichaController {

    private List<Ficha> fichas;

    public FichaController(){
        this.fichas = new ArrayList<>();
        Ficha ficha = new Ficha();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("willen");
        pessoa.setCpf("049.244.564-89");
        ficha.setPessoa(pessoa);
        ficha.setLocal("Centro de Conveções");
        ficha.setCodigo("MR01");
        this.fichas.add(ficha);
    }

    @GetMapping
    public List<Ficha> listar(){
        return this.fichas;
    }

    @PostMapping
    public boolean credenciar(@RequestParam String codigo){
        this.fichas.stream().map(ficha -> {
            if(ficha.getCodigo().equals(codigo)){
                this.fichas.remove(ficha);
                return true;
            }
            return false;
        });
        return false;
    }

}
