package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class BasePorto {
    private String nome_porto;
    protected List<Barco> barcosAtracados = new ArrayList<>();
    protected abstract boolean podeAtracar(Barco barco);

    public BasePorto(String nome_porto) {
        this.nome_porto = nome_porto;
    }

    public void atracarBarco(Barco barco) {
        if (podeAtracar(barco)) {
            barcosAtracados.add(barco);
            System.out.println("O " + barco + " foi atracado no porto " + nome_porto);
        } else {
            System.out.println("O " + barco + " não pode ser atracado no porto " + nome_porto);
        }
    }

    public void desatracarBarco(Barco barco) {
        if (barcosAtracados.remove(barco)) {
            System.out.println("O " + barco + " foi desatracado do porto " + nome_porto);
        } else {
            System.out.println("O " + barco + " não pode ser desatracado no porto " + nome_porto);
        }
    }
}
