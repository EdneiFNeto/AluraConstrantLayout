package com.example.aluraconstrantlayout.ui.model;

import java.math.BigDecimal;

public class Pacote {

    private String local;
    private String imagem;
    private int dia;
    private BigDecimal preco;

    public Pacote(){

    }

    public Pacote(String local, String imagem, int dia, BigDecimal preco) {
        this.local = local;
        this.imagem = imagem;
        this.dia = dia;
        this.preco = preco;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return this.local;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
