package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Cinema { private List<Filme> filmesDisponiveis = new ArrayList<>();
    private Set<String> assentosDisponiveis = new HashSet<>();
    private List<Ingresso> ingressosVendidos = new ArrayList<>();

    public Cinema() {
        filmesDisponiveis.add(new Filme("Homem Aranha", 19.0, 10));
        filmesDisponiveis.add(new Filme("Senhor dos Aneis", 17.0, 14));
        filmesDisponiveis.add(new Filme("Os Vingadores", 32.0, 12));
        filmesDisponiveis.add(new Filme("Eternos", 25.0, 12));
        filmesDisponiveis.add(new Filme("Scream", 26.0, 16));

        for (char linhaAssento = 'A'; linhaAssento <= 'F'; linhaAssento++) {
            for (int assento = 1; assento <= 5; assento++) {
                assentosDisponiveis.add("" + linhaAssento + assento);
            }
        }
    }

    public List<Filme> getFilmesDisponiveis() {
        return filmesDisponiveis;
    }

    public Set<String> getAssentosDisponiveis() {
        return assentosDisponiveis;
    }

    public List<Ingresso> getIngressosVendidos() {
        return ingressosVendidos;
    }

    public void venderIngresso(Ingresso ingresso) throws Exception {
        if (!assentosDisponiveis.contains(ingresso.getAssento())) {
            throw new Exception("Não fora permitido a venda do ingresso, pois, o assento especificado não está mais disponível!");
        }

        if (ingresso.getCliente().getIdade() < ingresso.getFilme().getIdadeMinima()) {
            throw new Exception("Não fora permitido a venda do ingresso, pois, sua idade não é menor que a Idade Mínima!");
        }

        assentosDisponiveis.remove(ingresso.getAssento());
        ingressosVendidos.add(ingresso);
        System.out.println("======================================");
        System.out.println("Venda do Ingresso realizada com sucesso! Informações: " + ingresso.getFilme().getNome() + " - " + ingresso.getAssento() + " - " + ingresso.getCliente().getNome());
    }
}
