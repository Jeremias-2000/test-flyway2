package com.example.testrelacionamentos.service;

import com.example.testrelacionamentos.model.Categoria;
import com.example.testrelacionamentos.model.Produto;
import com.example.testrelacionamentos.model.ProdutoDTO;
import com.example.testrelacionamentos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    
    @Autowired
    private ProdutoRepository produtoRepository;
    
    public List<Produto> listarProdutos(){
        return produtoRepository.findAll();
    }
    
    public Produto criarProduto(ProdutoDTO dto){
        Produto produto = Produto.builder()
                .descricao(dto.getDescricao())
                .quantidade(dto.getQuantidade())
                .valor(dto.getValor())
                .status(dto.getStatus())
                .categoria(new Categoria(dto.getCategoria()))
                .build();
        return produtoRepository.save(produto);
    }
}
