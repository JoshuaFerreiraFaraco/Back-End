package org.example;

public class PortoGrande extends BasePorto {
    public PortoGrande(String nome_porto) {
        super(nome_porto);
    }

    @Override
    protected boolean podeAtracar(Barco barco) {
        return barco.getTamanho_barco() >= 10;
    }
}
