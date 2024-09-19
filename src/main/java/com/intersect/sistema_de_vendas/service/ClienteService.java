package com.intersect.sistema_de_vendas.service;


import com.intersect.sistema_de_vendas.model.Cliente;
import com.intersect.sistema_de_vendas.model.Pedido;
import com.intersect.sistema_de_vendas.model.Produto;
import com.intersect.sistema_de_vendas.repository.ClienteRepository;
import com.intersect.sistema_de_vendas.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;


    public Cliente salvarCliente(Cliente cliente) {
        return  clienteRepository.save(cliente);
    }

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> buscarClientePorId(Long id) {
        return clienteRepository.findById(id);
    }
}
