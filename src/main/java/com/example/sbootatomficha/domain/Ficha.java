package com.example.sbootatomficha.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class Ficha {
    private Pessoa pessoa;
    private String local;
    private String codigo;
}
