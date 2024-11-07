package com.example.exercicio13;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class jogadorService {

    @Autowired
    private com.example.exercicio13.jogadorRepository jogadorRepository;

    public jogadorClass createJogador(jogadorDTO jogadorDTO) {
        jogadorClass jogador = jogadorMapper.toEntity(jogadorDTO);
        return jogadorRepository.save(jogador);
    }

    public List<jogadorClass> listJogadores() {
        return jogadorRepository.findAll();
    }
}