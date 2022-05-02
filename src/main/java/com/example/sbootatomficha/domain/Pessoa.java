package com.example.sbootatomficha.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class Pessoa {
    private String nome;
    private String cpf;
}
