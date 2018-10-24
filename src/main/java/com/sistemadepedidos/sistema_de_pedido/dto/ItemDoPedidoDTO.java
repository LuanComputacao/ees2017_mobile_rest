package com.sistemadepedidos.sistema_de_pedido.dto;

public class ItemDoPedidoDTO {
    private Integer produtoId;
    private Integer qtdade;

    public Integer getProdutoId() {
        return produtoId;
    }

    public void setProdutoId(Integer produtoId) {
        this.produtoId = produtoId;
    }

    public Integer getQtdade() {
        return qtdade;
    }

    public void setQtdade(Integer qtdade) {
        this.qtdade = qtdade;
    }

    @Override
    public String toString() {
        return "ItemDoPedidoDTO{" +
                "produtoId=" + produtoId +
                ", qtdade=" + qtdade +
                '}';
    }
}
