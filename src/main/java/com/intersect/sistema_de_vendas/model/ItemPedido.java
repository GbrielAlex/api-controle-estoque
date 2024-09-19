package com.intersect.sistema_de_vendas.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Entity
public class ItemPedido {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "produto_id", nullable = false)
    private Produto produto;


    @ManyToOne
    @JoinColumn(name = "pedido_id", nullable = false)
    private Pedido pedido;

    @Getter
    @Setter
    private Integer quantidade;

    @Getter
    @Setter
    private BigDecimal preco;

    public ItemPedido(Produto produto, Pedido pedido, Integer quantidade, BigDecimal preco) {
        this.produto = produto;
        this.pedido = pedido;
        this.quantidade = quantidade;
        this.preco = preco;
    }


    public ItemPedido() {

    }
}
