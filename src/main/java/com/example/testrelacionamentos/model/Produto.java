package com.example.testrelacionamentos.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "produto")
public class Produto implements Serializable {

    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String descricao;

    private int quantidade;

    private BigDecimal valor;

    private int status;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

}
