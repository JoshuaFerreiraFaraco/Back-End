package com.example.exercicio08;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClient;

import java.util.HashMap;

@RestController
public class FipeController {
    RestClient cliente = RestClient.create("https://parallelum.com.br");

    @PostMapping("/valor")
    @ResponseBody
    public HashMap<String, String> valor(@RequestBody Carro carro) {
        HashMap<String, String> respostaPersonalizada = new HashMap<>();
        HashMap<String, String> resposta = cliente
        .get()
        .uri("/fipe/api/v1/carros/marcas/"+ carro.getMarca() + "/modelos/" + carro.getModelo() + "/anos/" + carro.getAno())
        .retrieve()
        .body(HashMap.class);

        respostaPersonalizada.put("valor", resposta.get("Valor"));
        respostaPersonalizada.put("mes", resposta.get("MesReferencia"));
        return respostaPersonalizada;
    }

}
