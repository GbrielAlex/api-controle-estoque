package com.intersect.sistema_de_vendas.controller;

import com.intersect.sistema_de_vendas.model.ItemPedido;
import com.intersect.sistema_de_vendas.model.ItemPedidoDTO;
import com.intersect.sistema_de_vendas.model.Pedido;
import com.intersect.sistema_de_vendas.model.Produto;
import com.intersect.sistema_de_vendas.service.ItemPedidoService;
import com.intersect.sistema_de_vendas.service.PedidoService;
import com.intersect.sistema_de_vendas.service.ProdutoService;
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

    @Autowired
    private ProdutoService produtoService;

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
        Pedido pedido = pedidoService.buscarPedidoPorId(id);
        return ResponseEntity.ok(pedido);
    }

    @PostMapping("/{pedidoId}/itens/adicionar")
    public ResponseEntity<ItemPedido> adicionarItem(@PathVariable Long pedidoId, @RequestBody ItemPedidoDTO itemPedidoDTO) {

        // Busca o pedido pelo ID
        Pedido pedido = pedidoService.buscarPedidoPorId(pedidoId);

        // Busca o produto pelo ID
        Produto produto = produtoService.buscarProdutoPorId(pedidoId);

        // Cria o ItemPedido
        ItemPedido itemPedido = new ItemPedido(produto, pedido, itemPedidoDTO.getQuantidade(), itemPedidoDTO.getPreco());

        // Salva o ItemPedido
        ItemPedido novoItemPedido = itemPedidoService.salvar(itemPedido);

        return ResponseEntity.ok(novoItemPedido);
    }
}