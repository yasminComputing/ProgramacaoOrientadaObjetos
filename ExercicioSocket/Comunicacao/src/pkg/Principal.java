package pkg;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        int opcao;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

            case 1:

                System.out.print("Título: ");
                String titulo = sc.nextLine();

                System.out.print("Autor: ");
                String autor = sc.nextLine();

                System.out.print("Ano de publicação: ");
                int ano = sc.nextInt();
                sc.nextLine();

                System.out.print("Emprestado (sim/nao): ");
                boolean emprestado = sc.nextLine().equalsIgnoreCase("sim");

                Livro livro = new Livro(titulo, autor, ano, emprestado);

                biblioteca.adicionarLivro(livro);

                break;

            case 2:

                biblioteca.carregarArquivo("livros");
                biblioteca.listarLivros();

                break;

            case 0:

                System.out.println("Programa Finalizado!");

                break;

            default:

                System.out.println("Opção inválida!");

            }

        } while (opcao != 0);

        sc.close();

    }

}