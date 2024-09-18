package com.intersect.sistema_de_vendas.service;

import com.intersect.sistema_de_vendas.model.Produto;
import com.intersect.sistema_de_vendas.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class produtoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }
    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }
}
