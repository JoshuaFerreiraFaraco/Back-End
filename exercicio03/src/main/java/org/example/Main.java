package org.example;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Declaração de variaveis, inserindo os barcos
        Barco barco1 = new Barco("Barco 1", 2);
        Barco barco2 = new Barco("Barco 2", 5);
        Barco barco3 = new Barco("Barco 3", 7);
        Barco barco4 = new Barco("Barco 4", 12);
        Barco barco5 = new Barco("Barco 5", 20);

        List<Barco> barcos = List.of(barco1, barco2, barco3, barco4, barco5);
        PortoPequeno portoPequeno = new PortoPequeno("Porto Pequeno");
        PortoGrande portoGrande = new PortoGrande("Porto Grande");

        //For verificando se os barcos podem atracar
        for (Barco barco : barcos) {
            if (portoPequeno.podeAtracar(barco)) {
                portoPequeno.atracarBarco(barco);
            } else if (portoGrande.podeAtracar(barco)) {
                portoGrande.atracarBarco(barco);
            } else {
                System.out.println(barco + " não pode atracar em nenhum porto.");
            }
        }
    }
}
