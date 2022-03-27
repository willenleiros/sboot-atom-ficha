package com.example.sbootatomficha.domain;

import lombok.Data;

@Data
public class Ficha {
    private Pessoa pessoa;
    private String local;
    private String codigo;
}
