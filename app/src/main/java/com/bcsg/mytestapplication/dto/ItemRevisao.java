package com.bcsg.mytestapplication.dto;

public class ItemRevisao {
    private int codigo;
    private String descricao;
    private float preco;
    private int quantidade;

    public ItemRevisao() {
        super();
    }

    public ItemRevisao(int codigo, String descricao, float preco) {
        this();

        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public ItemRevisao(int codigo, String descricao, float preco, int quantidade) {
        this(codigo, descricao, preco);

        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
