package com.sistemadepedidos.sistema_de_pedido.config;

import com.sistemadepedidos.sistema_de_pedido.domain.Cliente;
import com.sistemadepedidos.sistema_de_pedido.domain.ItemDoPedido;
import com.sistemadepedidos.sistema_de_pedido.domain.Pedido;
import com.sistemadepedidos.sistema_de_pedido.domain.Produto;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class RepositoryRestConfig extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {

        config.exposeIdsFor(
                Cliente.class,
                ItemDoPedido.class,
                Pedido.class,
                Produto.class
        );
    }
}