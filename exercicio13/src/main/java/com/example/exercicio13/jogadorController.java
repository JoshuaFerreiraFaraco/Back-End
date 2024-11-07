package com.example.exercicio13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/jogadores")
public class jogadorController {

    @Autowired
    private com.example.exercicio13.jogadorService jogadorService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public jogadorClass createJogador(@Valid @RequestBody jogadorDTO jogadorDTO) {
        return jogadorService.createJogador(jogadorDTO);
    }

    @GetMapping
    public List<jogadorClass> listJogadores() {
        return jogadorService.listJogadores();
    }
}
