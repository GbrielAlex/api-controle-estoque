package com.intersect.sistema_de_vendas.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Getter
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private List<ItemPedido> itens;

    // Outros atributos como cliente, data, etc.

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Cliente cliente;

    // Getters, Setters e Construtores
    public Pedido() {
    }

    public List<ItemPedido> addItensNoPedido(ItemPedido item) {
        itens.add(item);
        return itens;
    }




}

