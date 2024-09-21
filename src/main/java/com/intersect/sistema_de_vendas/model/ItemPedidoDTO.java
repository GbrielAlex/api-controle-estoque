package com.intersect.sistema_de_vendas.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class ItemPedidoDTO {

    @Getter
    private Long produtoId;

    @Getter
    @Setter
    private Integer quantidade;

    @Getter
    @Setter
    private BigDecimal preco;


}
