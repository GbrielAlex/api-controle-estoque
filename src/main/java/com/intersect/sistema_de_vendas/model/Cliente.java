package com.intersect.sistema_de_vendas.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
public class Cliente {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Pedido> pedidos;
    @Getter
    @Setter

    private String nome;

    @Getter
    @Setter
    private String cpf;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String telefone;

    @Getter
    @Setter
    private String endereco;

    @Getter
    @Setter
    private String cidade;
}
