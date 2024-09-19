package com.intersect.sistema_de_vendas.controller;

import com.intersect.sistema_de_vendas.model.ItemPedido;
import com.intersect.sistema_de_vendas.model.Pedido;
import com.intersect.sistema_de_vendas.repository.PedidoRepository;
import com.intersect.sistema_de_vendas.service.ItemPedidoService;
import com.intersect.sistema_de_vendas.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private ItemPedidoService itemPedidoService;

    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public List<Pedido> listarPedidos() {
        return pedidoService.listarPedidos();
    }

    @PostMapping("/criar-pedido")
    public Pedido criarPedido(@RequestBody Pedido pedido) {
        return pedidoService.criarPEdido(pedido);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> getPedidoById(@PathVariable Long id) {
        Optional<Pedido> pedido = pedidoService.buscarPedidoPorId(id);
        if (pedido.isPresent()) {
            return ResponseEntity.ok(pedido.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
