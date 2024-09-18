package com.intersect.sistema_de_vendas.controller;

import com.intersect.sistema_de_vendas.model.Cliente;
import com.intersect.sistema_de_vendas.model.Produto;
import com.intersect.sistema_de_vendas.repository.ClienteRepository;
import com.intersect.sistema_de_vendas.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public Cliente adicionarCliente(@RequestBody Cliente cliente) {
        return clienteService.salvarCliente(cliente);
    }

    @GetMapping
    public List<Cliente> listarClientes() {
        return clienteService.listarClientes();
    }


}
