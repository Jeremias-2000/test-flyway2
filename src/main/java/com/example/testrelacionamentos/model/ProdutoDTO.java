package com.example.testrelacionamentos.model;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoDTO {
    private String descricao;
    private int quantidade;

    private BigDecimal valor;
    private int status;

    private int categoria;
}
