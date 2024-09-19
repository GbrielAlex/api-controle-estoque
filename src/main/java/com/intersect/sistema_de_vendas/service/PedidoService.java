package com.intersect.sistema_de_vendas.service;

import com.intersect.sistema_de_vendas.model.Cliente;
import com.intersect.sistema_de_vendas.model.Pedido;
import com.intersect.sistema_de_vendas.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido criarPEdido(Pedido pedido) {
        return  pedidoRepository.save(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }

    public Optional<Pedido> buscarPedidoPorId(Long id) {
        return pedidoRepository.findById(id);
    }

}
