package com.example.testrelacionamentos.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class ProdutoDTO {
    private String descricao;
    private int quantidade;

    private BigDecimal valor;
    private int status;

    private int categoria;
}
