package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner leitor = new Scanner(System.in);

            System.out.println("Que ambientação você prefere?");
            System.out.println("1.  Sci-Fi");
            System.out.println("2. Medieval");
            String primeiraEscolha = leitor.nextLine();

            if (!primeiraEscolha.equals("1") && !primeiraEscolha.equals("2")) {
                return;
            }

            System.out.println("Que gênero você prefere?");
            System.out.println("1. Comédia");
            System.out.println("2. Drama");
            String segundaEscolha = leitor.nextLine();

            if (!segundaEscolha.equals("1") && !segundaEscolha.equals("2")) {
                return;
            }

            String filmeRecomendado;
            if (primeiraEscolha.equals("1") && segundaEscolha.equals("1")){
                filmeRecomendado = "Homens de Preto";
                System.out.println("Filme recomendado: " + filmeRecomendado);
            }
            if (primeiraEscolha.equals("1") && segundaEscolha.equals("2")) {
                filmeRecomendado = "Arrival";
                System.out.println("Filme recomendado: " + filmeRecomendado);
            }
            if (primeiraEscolha.equals("2") && segundaEscolha.equals("1")) {
                filmeRecomendado = "Shrek";
                System.out.println("Filme recomendado: " + filmeRecomendado);
            }
            if (primeiraEscolha.equals("2") && segundaEscolha.equals("2")) {
                filmeRecomendado = "Gladiador";
                System.out.println("Filme recomendado: " + filmeRecomendado);
            }
        }
    }
}