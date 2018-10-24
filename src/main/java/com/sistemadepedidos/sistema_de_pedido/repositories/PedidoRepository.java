package com.sistemadepedidos.sistema_de_pedido.repositories;

import com.sistemadepedidos.sistema_de_pedido.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "pedidos")
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
