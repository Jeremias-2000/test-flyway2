package com.example.testrelacionamentos.controller;

import com.example.testrelacionamentos.model.Produto;
import com.example.testrelacionamentos.model.ProdutoDTO;
import com.example.testrelacionamentos.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/listar")
    @ResponseStatus(HttpStatus.OK)
    public List<Produto> listar(){
        return produtoService.listarProdutos();
    }

    @PostMapping("/criar")
    @ResponseStatus(HttpStatus.CREATED)
    public void criar(@RequestBody ProdutoDTO produto){
        produtoService.criarProduto(produto);
    }
}
