package com.example.exercicio12;

public class contaMapper {
    public static contaDTO toDTO(conta conta) {
        return new contaDTO(conta.getCodigo(), conta.getCliente());
    }
}
