package com.example.exercicio13;

import jakarta.validation.constraints.NotBlank;

public class jogadorDTO {

    @NotBlank(message = "Insira um nome correto")
    private String nome;

    @NotBlank(message = "Insira um apelido correto")
    private String apelido;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
}


