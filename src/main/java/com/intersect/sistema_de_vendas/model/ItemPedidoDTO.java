package com.intersect.sistema_de_vendas.model;

import java.math.BigDecimal;

public class ItemPedidoDTO {

    private Long produtoId;
    private Integer quantidade;
    private BigDecimal preco;

    // Getters e Setters
    public Long getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Long produtoId) {
        this.produtoId = produtoId;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

}
