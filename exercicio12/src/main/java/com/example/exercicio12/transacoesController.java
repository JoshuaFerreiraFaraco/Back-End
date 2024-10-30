package com.example.exercicio12;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transacoes")
public class transacoesController {

    private final com.example.exercicio12.transacoesService transacoesService;

    public transacoesController(com.example.exercicio12.transacoesService transacoesService) {
        this.transacoesService = transacoesService;
    }

    @PostMapping
    public ResponseEntity<transacoesResponseDTO> gerarTransacao(@RequestBody transacoesRequestDTO request) {
        conta origem = transacoesService.getContaCodigo(request.origem())
                .orElseThrow(() -> new IllegalArgumentException("Atenção! Conta de origem não encontrada!"));
        conta destino = transacoesService.getContaCodigo(request.destino())
                .orElseThrow(() -> new IllegalArgumentException("Atenção! Conta de destino não encontrada!"));

        transacoesService.postTransferir(origem, destino, request.valor());

        return ResponseEntity.ok(
                new transacoesResponseDTO(
                        contaMapper.toDTO(origem),
                        contaMapper.toDTO(destino),
                        request.valor()
                )
        );
    }
}
