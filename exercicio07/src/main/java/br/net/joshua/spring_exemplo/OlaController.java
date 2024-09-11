package br.net.joshua.spring_exemplo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaController {
    @GetMapping("/recomendar")
    public String recomendacao(String genero, String ambiente){
        String retorno = "";
        if(genero.equals("acao") && ambiente.equals("futurista")){
            retorno = "Homens de Preto";
        } else if (genero.equals("acao") && ambiente.equals("sci-fi")) {
            retorno = "Star Wars";
        } else if (genero.equals("acao") && ambiente.equals("medieval")) {
            retorno = "The Witcher";
        } else if (genero.equals("comedia") && ambiente.equals("medieval")) {
            retorno = "Shrek";
        } else {
            retorno = "Nenhuma recomendação para este genero ou atributo no sistema!";
        }

        return retorno;
    }
}
