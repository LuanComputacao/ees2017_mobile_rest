package com.sistemadepedidos.sistema_de_pedido.services;

import com.sistemadepedidos.sistema_de_pedido.domain.*;
import com.sistemadepedidos.sistema_de_pedido.repositories.ClienteRepository;
import com.sistemadepedidos.sistema_de_pedido.repositories.ItemDoPedidoRepository;
import com.sistemadepedidos.sistema_de_pedido.repositories.PedidoRepository;
import com.sistemadepedidos.sistema_de_pedido.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;

@Service
public class DBTestService {

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    PedidoRepository pedidoRepository;

    @Autowired
    ItemDoPedidoRepository itemDoPedidoRepository;

    public void instantiateTestDataBase() throws ParseException {

        Cliente cliente1 = new Cliente("00011100011", "Teste1", "Testando1");
        Cliente cliente2 = new Cliente("00011100012", "Teste2", "Testando2");
        Cliente cliente3 = new Cliente("00011100013", "Teste3", "Testando3");
        Cliente cliente4 = new Cliente("00011100014", "Teste4", "Testando4");
        Cliente cliente5 = new Cliente("00011100015", "Teste5", "Testando5");

        clienteRepository.saveAll(Arrays.asList(
                cliente1,
                cliente2,
                cliente3,
                cliente4,
                cliente5
        ));


        Produto produto1 = new Produto("Lápis B1");
        Produto produto2 = new Produto("Lápis B2");
        Produto produto3 = new Produto("Lápis B3");
        Produto produto4 = new Produto("Lápis B4");
        Produto produto5 = new Produto("Lápis B5");

        produtoRepository.saveAll(Arrays.asList(
                produto1,
                produto2,
                produto3,
                produto4,
                produto5
        ));

        Pedido pedido1 = new Pedido(new Date(), cliente1);
        Pedido pedido2 = new Pedido(new Date(), cliente2);
        Pedido pedido3 = new Pedido(new Date(), cliente3);
        Pedido pedido4 = new Pedido(new Date(), cliente4);
        Pedido pedido5 = new Pedido(new Date(), cliente5);

        pedidoRepository.saveAll(Arrays.asList(
                pedido1,
                pedido2,
                pedido3,
                pedido4,
                pedido5
        ));


        ItemDoPedido itemDoPedido = new ItemDoPedido(new ItemDoPedidoPK(pedido1.getId(), produto1.getId()));
        ItemDoPedido itemDoPedido1 = new ItemDoPedido(3, pedido1, produto2);
//        ItemDoPedido itemDoPedido2 = new ItemDoPedido(3, pedido1, produto1);
//        ItemDoPedido itemDoPedido3 = new ItemDoPedido(3, pedido1, produto1);
//
        itemDoPedidoRepository.saveAll(Arrays.asList(
                itemDoPedido,
                itemDoPedido1
//                itemDoPedido2,
//                itemDoPedido3
        ));

    }
}
