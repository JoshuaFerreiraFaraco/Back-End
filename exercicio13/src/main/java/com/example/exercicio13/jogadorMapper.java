package com.example.exercicio13;

public class jogadorMapper {

    public static jogadorClass toEntity(jogadorDTO dto) {
        jogadorClass jogador = new jogadorClass();
        jogador.setNome(dto.getNome());
        jogador.setApelido(dto.getApelido());
        return jogador;
    }

    public static jogadorDTO toDTO(jogadorClass jogador) {
        jogadorDTO dto = new jogadorDTO();
        dto.setNome(jogador.getNome());
        dto.setApelido(jogador.getApelido());
        return dto;
    }
}