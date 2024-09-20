package com.intersect.sistema_de_vendas.service;


import com.intersect.sistema_de_vendas.model.ItemPedido;
import com.intersect.sistema_de_vendas.model.Pedido;
import com.intersect.sistema_de_vendas.repository.ItemPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemPedidoService {

    @Autowired
    private ItemPedidoRepository itemPedidoRepository;

    public ItemPedido salvar(ItemPedido itemPedido){
        return itemPedidoRepository.save(itemPedido);
    }

    public List<ItemPedido> listar(){
        return itemPedidoRepository.findAll();
    }


}
