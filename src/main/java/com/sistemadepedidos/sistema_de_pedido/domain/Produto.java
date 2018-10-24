package com.sistemadepedidos.sistema_de_pedido.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonRootName;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by luancomputacao on 24/02/18.
 */
@Entity
@Table(name = "produto")
@JsonRootName(value = "product")
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 11)
    private Integer id;

    @Length(max = 45)
    @Column(name = "descricao", length = 45, nullable = false)
    private String descricao;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "produto")
    @JsonBackReference
    private Collection<ItemDoPedido> itemDoPedidoCollection;

    public Produto() {
    }

    public Produto(@Length(max = 45) String descricao) {
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Collection<ItemDoPedido> getItemDoPedidoCollection() {
        return itemDoPedidoCollection;
    }

    public void setItemDoPedidoCollection(Collection<ItemDoPedido> itemDoPedidoCollection) {
        this.itemDoPedidoCollection = itemDoPedidoCollection;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
