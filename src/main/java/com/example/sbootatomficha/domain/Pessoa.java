package com.example.sbootatomficha.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@AllArgsConstructor
public class Pessoa {
    private String nome;
    private String cpf;
}
