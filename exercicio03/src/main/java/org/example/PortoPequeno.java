package org.example;

public class PortoPequeno extends BasePorto {
    public PortoPequeno(String nome_porto) {
        super(nome_porto);
    }

    @Override
    protected boolean podeAtracar(Barco barco) {
        return barco.getTamanho_barco() <= 10;
    }
}
