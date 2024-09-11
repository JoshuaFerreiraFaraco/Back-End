package org.example;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("======================================");
                System.out.println("Filmes disponíveis:");
                List<Filme> filmes = cinema.getFilmesDisponiveis();
                for (int i = 0; i < filmes.size(); i++) {
                    Filme filme = filmes.get(i);
                    System.out.println((i + 1) + "- " + filme.getNome() + " (Preço: R$ " + filme.getPreco() + ", Idade Mínima: " + filme.getIdadeMinima() + ")");
                }

                System.out.println("======================================");
                System.out.print("Qual filme você deseja assistir? (Favor digitar o nome completo do filme) ");
                String filmeEscolha = scanner.nextLine();
                Filme filmeSelecionado = null;
                for (Filme filme : filmes) {
                    if (filme.getNome().equalsIgnoreCase(filmeEscolha)) {
                        filmeSelecionado = filme;
                        break;
                    }
                }

                if (filmeEscolha.isEmpty()){
                    System.out.println("======================================");
                    System.out.println("Sistema encerrado!");
                    break;
                }

                if (filmeSelecionado == null) {
                    System.out.println("======================================");
                    System.out.println("Filme não encontrado!");
                    continue;
                }

                System.out.println("======================================");
                System.out.print("Qual assento você deseja sentar? (Assentos: A1 a F5) ");
                String assentoEscolha = scanner.nextLine();

                if (!cinema.getAssentosDisponiveis().contains(assentoEscolha)) {
                    System.out.println("======================================");
                    System.out.println("Não fora permitido a venda do ingresso, pois, seu assento não está mais disponível!");
                    continue;
                }

                System.out.println("======================================");
                System.out.print("Digite o seu nome? ");
                String nomeCliente = scanner.nextLine();
                int idadeCliente;
                while (true) {
                    System.out.println("======================================");
                    System.out.print("Digite a sua idade? ");
                    try {
                        idadeCliente = scanner.nextInt();
                        scanner.nextLine();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("======================================");
                        System.out.println("[ERRO] Idade inválida! Favor tentar novamente.");
                        scanner.next();
                    }
                }

                Cliente cliente = new Cliente(nomeCliente, idadeCliente);
                Ingresso ingresso = new Ingresso(cliente, filmeSelecionado, assentoEscolha);

                cinema.venderIngresso(ingresso);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }
}
