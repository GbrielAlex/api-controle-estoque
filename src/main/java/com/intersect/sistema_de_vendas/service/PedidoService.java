package com.intersect.sistema_de_vendas.service;

import com.intersect.sistema_de_vendas.model.Cliente;
import com.intersect.sistema_de_vendas.model.Pedido;
import com.intersect.sistema_de_vendas.model.Produto;
import com.intersect.sistema_de_vendas.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public Pedido criarPEdido(Pedido pedido) {
        return  pedidoRepository.save(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }



    public Pedido buscarPedidoPorId(Long id) {
        Optional<Pedido> pedido = pedidoRepository.findById(id);
        if (!pedido.isPresent()) {
            throw new RuntimeException("Produto não encontrado");
        }
        return pedido.get();
    }

}
