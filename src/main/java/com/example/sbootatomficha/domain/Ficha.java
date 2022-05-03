package com.example.sbootatomficha.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@AllArgsConstructor
public class Ficha {
    private Pessoa pessoa;
    private String local;
    private String codigo;
}
