package org.example;

public class Barco {
    private String nome_barco;
    private int tamanho_barco;

    public Barco(String nome_barco, int tamanho_barco) {
        this.nome_barco = nome_barco;
        this.tamanho_barco = tamanho_barco;
    }

    public int getTamanho_barco() {
        return tamanho_barco;
    }

    @Override
    public String toString() {
        return nome_barco;
    }
}
