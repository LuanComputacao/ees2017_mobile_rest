package com.sistemadepedidos.sistema_de_pedido.repositories;

import com.sistemadepedidos.sistema_de_pedido.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "produtos")
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
