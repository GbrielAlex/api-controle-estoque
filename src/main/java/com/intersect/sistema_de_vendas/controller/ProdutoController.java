package com.intersect.sistema_de_vendas.controller;

import com.intersect.sistema_de_vendas.model.Produto;
import com.intersect.sistema_de_vendas.service.produtoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private produtoService produtoService;

    @PostMapping
    public Produto adicionarProduto(@RequestBody Produto produto){
        return produtoService.salvarProduto(produto);
    }

    @GetMapping
    public List<Produto> listarProdutos(){
        return produtoService.listarProdutos();
    }

}
