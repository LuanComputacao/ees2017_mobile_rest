package com.sistemadepedidos.sistema_de_pedido.repositories;

import com.sistemadepedidos.sistema_de_pedido.domain.ItemDoPedido;
import com.sistemadepedidos.sistema_de_pedido.domain.ItemDoPedidoPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(path = "itens-do-pedido")
public interface ItemDoPedidoRepository extends JpaRepository<ItemDoPedido, ItemDoPedidoPK> {

}
