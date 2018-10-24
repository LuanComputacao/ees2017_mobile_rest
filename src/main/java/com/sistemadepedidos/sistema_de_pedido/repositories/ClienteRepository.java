package com.sistemadepedidos.sistema_de_pedido.repositories;

import com.sistemadepedidos.sistema_de_pedido.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
