package com.example.exercicio12;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class transacoesService {
    private final List<conta> contas = new ArrayList<>();

    public transacoesService() {
        contas.add(new conta("500-1", "Fulano", 1000.0));
        contas.add(new conta("320-2", "Ciclano", 500.0));
    }

    public Optional<conta> getContaCodigo(String codigo) {
        return contas.stream()
                .filter(conta -> conta.getCodigo().equals(codigo))
                .findFirst();
    }

    public void postTransferir(conta origem, conta destino, Double valor) {
        origem.setSaldo(origem.getSaldo() - valor);
        destino.setSaldo(destino.getSaldo() + valor);
    }
}
