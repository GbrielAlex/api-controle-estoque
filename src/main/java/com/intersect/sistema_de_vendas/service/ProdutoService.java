package com.intersect.sistema_de_vendas.service;

import com.intersect.sistema_de_vendas.model.Produto;
import com.intersect.sistema_de_vendas.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }
    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    public Produto buscarProdutoPorId(Long id) {
        Optional<Produto> produto = produtoRepository.findById(id);
        if (!produto.isPresent()) {
            throw new RuntimeException("Produto não encontrado");
        }
        return produto.get();
    }


}
