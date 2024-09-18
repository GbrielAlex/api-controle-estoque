package com.intersect.sistema_de_vendas.repository;

import com.intersect.sistema_de_vendas.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
