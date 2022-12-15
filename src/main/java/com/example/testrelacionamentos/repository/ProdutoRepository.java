package com.example.testrelacionamentos.repository;

import com.example.testrelacionamentos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    @Override
    @Query("from Produto as p  inner join Categoria as c on p.categoria.id = c.id ")
    List<Produto> findAll();
}
