package com.example.sbootatomficha.controller;

import com.example.sbootatomficha.domain.Ficha;
import com.example.sbootatomficha.domain.Pessoa;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/fichas")
public class FichaController {

    private Logger logger = LoggerFactory.getLogger(FichaController.class);

    private List<Ficha> fichas;

    public FichaController(){
        this.fichas = List.of(
                new Ficha(new Pessoa("José","123.456.789-00"),"Centro de Conveções","MR01"),
                new Ficha(new Pessoa("Antônio","789.456.123-00"),"Centro de Turismo","C20"));

    }

    @GetMapping
    public List<Ficha> listar(){
        return this.fichas;
    }

    @PostMapping
    public ResponseEntity<List<Ficha>> credenciar(@RequestBody Ficha fc){
        List<Ficha> fichas =  this.fichas.stream().filter(ficha ->
            ficha.getCodigo().equals(fc.getCodigo())).collect(Collectors.toList());
        this.logger.info("ficha {}",fichas);
        return ResponseEntity.ok(fichas);
    }

}
